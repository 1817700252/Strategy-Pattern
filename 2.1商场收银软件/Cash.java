package day02_demo01;

public class Cash
{
	private double	total	= 0;

	public void submit(int num, double price)
	{
		double totalPrices = num * price;
		total += totalPrices;

		System.out.println("单价:" + price + " 数量:" + num + "合计:" + totalPrices);
	}

	public double getTotal()
	{
		return total;
	}

	public void setTotal(double total)
	{
		this.total = total;
	}
}
