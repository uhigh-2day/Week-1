import java.util.Scanner;
class quodiv
{
	static void calculation(double num1, double num2)
	{
		double div = num1 / num2;
		double quo = num1 % num2;
		System.out.println("The Quotient is " + quo + " and Reminder is " + div + " of two number " + num1 + " and " + num2 );

	}
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		double number1 = scanner.nextDouble();
		double number2 = scanner.nextDouble();
		quodiv.calculation(number1,number2);
	}
}