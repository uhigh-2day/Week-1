import java.util.Scanner;
class FeesInput
{
	static double discountedAmt(double fee, double discountPercentage)
	{
		double discount = 125000 - ((125000*discountPercentage)/100);
		return discount;
	}
	public static void main (String args[])
	{
		Scanner scanner = new Scanner(System.in);
		double fees = scanner.nextDouble();
		double discountPercentage = scanner.nextDouble();
		double AMT = FeesInput.discountedAmt(fees,discountPercentage);
		System.out.println("The discount amount is INR " + (fees - AMT) + " and final discounted fee is INR " + AMT);
	}
}
		