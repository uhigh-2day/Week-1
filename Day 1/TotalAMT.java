import java.util.Scanner;
class TotalAMT
{
	static void conversion(double unit, double price)
	{
		double totalAMT = unit * price;
		System.out.println("The total purchase price is INR " + totalAMT + " if the quantity " + unit + " and unit price is INR " + price );

	}
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		double unitPrice = scanner.nextDouble();
		double quantity = scanner.nextDouble();
		TotalAMT.conversion(quantity,unitPrice);
	}
}