package cn.itcast.chapter09.model1.domain;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
public class Calculator {
	// firstNum表示第一个运算数
	private String firstNum;
	// secondNum表示第二个运算数
	private String secondNum;
	// operator表示运算符
	private char operator;
	// error用于封装错误信息
	private Map<String, String> errors = new HashMap<String, String>();

	// 属性setter和getter方法
	public Map<String, String> getErrors() {
		return errors;
	}
	public void setErrors(Map<String, String> errors) {
		this.errors = errors;
	}
	public String getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(String firstNum) {
		this.firstNum = firstNum;
	}
	public String getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(String secondNum) {
		this.secondNum = secondNum;
	}
	public char getOperator() {
		return operator;
	}
	public void setOperator(char operator) {
		this.operator = operator;
	}
	/*
	 * calculate()方法根据传入的运算数和符号进行运算
	 */
	public String calculate() {
		BigDecimal result = null;
		BigDecimal first = new BigDecimal(firstNum);
		BigDecimal second = new BigDecimal(secondNum);
		switch (operator) {
		case '+':
			result = first.add(second);
			break;
		case '-':
			result = first.subtract(second);
			break;
		case '*':
			result = first.multiply(second);
			break;
		case '/':
			if ("0".equals(secondNum)) {
				throw new RuntimeException("除数不能为0！");
			}
			result = first.divide(second);
			break;
		default:
			break;
		}
		return result.toString();
	}
	/*
	 * validate()方法用于验证表单传入的数据是否合法
	 */
	public boolean validate() {
        // flag是标识符，如果数据合法flag为true，反之为false
		boolean flag = true;
		Pattern p = Pattern.compile("\\d+");// 正则表达式，匹配数字
		if (firstNum == null || "".equals(firstNum)) { // 判断不能为空
			errors.put("firstNum", "第一个运算数不能为空");
			flag = false;
		} else if (!p.matcher(firstNum).matches()) { // 判断不能为非数字
			errors.put("firstNum", "第一个运算数必须为数字");
			flag = false;
		}
		if (secondNum == null || "".equals(secondNum)) { 
			errors.put("secondNum", "第二个运算数不能为空");
			flag = false;
		} else if (!p.matcher(secondNum).matches()) {
			errors.put("secondNum", "第二个运算数必须为数字");
			flag = false;
		}
		return flag;
	}
}