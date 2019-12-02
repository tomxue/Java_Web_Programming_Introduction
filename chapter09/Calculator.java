package cn.itcast.chapter09.model1.domain;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
public class Calculator {
	// firstNum��ʾ��һ��������
	private String firstNum;
	// secondNum��ʾ�ڶ���������
	private String secondNum;
	// operator��ʾ�����
	private char operator;
	// error���ڷ�װ������Ϣ
	private Map<String, String> errors = new HashMap<String, String>();

	// ����setter��getter����
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
	 * calculate()�������ݴ�����������ͷ��Ž�������
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
				throw new RuntimeException("��������Ϊ0��");
			}
			result = first.divide(second);
			break;
		default:
			break;
		}
		return result.toString();
	}
	/*
	 * validate()����������֤������������Ƿ�Ϸ�
	 */
	public boolean validate() {
        // flag�Ǳ�ʶ����������ݺϷ�flagΪtrue����֮Ϊfalse
		boolean flag = true;
		Pattern p = Pattern.compile("\\d+");// ������ʽ��ƥ������
		if (firstNum == null || "".equals(firstNum)) { // �жϲ���Ϊ��
			errors.put("firstNum", "��һ������������Ϊ��");
			flag = false;
		} else if (!p.matcher(firstNum).matches()) { // �жϲ���Ϊ������
			errors.put("firstNum", "��һ������������Ϊ����");
			flag = false;
		}
		if (secondNum == null || "".equals(secondNum)) { 
			errors.put("secondNum", "�ڶ�������������Ϊ��");
			flag = false;
		} else if (!p.matcher(secondNum).matches()) {
			errors.put("secondNum", "�ڶ�������������Ϊ����");
			flag = false;
		}
		return flag;
	}
}