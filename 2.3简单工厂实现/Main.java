package day02_demo03;

public class Main {
	private static double total = 0;
	public static void main(String []args) {
		consume("�����շ�",1,1000);
		consume("��300��100",1,1000);
		consume("�����",1,1000);
		System.out.println("�ܼƣ�"+total);
	}
	public static void consume(String type,int num,double price) {
		CashContext cashContext = new CashContext(type);
		
		double totalPrices = cashContext.acceptCash(num * price);
		total += totalPrices;
		System.out.println("���ۣ�"+price+"������"+num+"�ϼƣ�"+totalPrices);
	}
}
