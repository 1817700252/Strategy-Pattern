package day02_demo03;

import day02_demo03.CashSuper;

public class CashReturn implements CashSuper{
	private double moneyCondition = 0;
	private double moneyReturn = 0;
	public CashReturn(double moneyCondition,double moneyReturn) {
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}
	public double acceptCash(double money) {
		double result = money;
		if(money >= moneyCondition) {
			result = money - money / moneyCondition * moneyReturn;
		}
		return result;
	}
}
