package cn.itcast.chapter08.javabean;
public class Manager extends Employee {
	private double bonus=500.0;
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
}