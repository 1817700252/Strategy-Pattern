package day02_demo03;

import day02_demo03.CashNormal;
import day02_demo03.CashRebate;
import day02_demo03.CashReturn;
import day02_demo03.CashSuper;

public class CashFactory {
	public static CashSuper createCash(String type) {
		CashSuper cs = null;
		if ("�����շ�".equals(type)) {
			cs = new CashNormal();
		}
		else if ("��300��100".equals(type)) {
			cs = new CashReturn(300,100);
		}
		else if ("�����".equals(type)) {
			cs = new CashRebate(0.8);
		}
		return cs;
	}
}
