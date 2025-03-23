import java.util.Scanner;
class DoubleOpt
{
	static void calculation(double a, double b, double c)
	{
		double r1 = a + b *c;
		double r2 = a * b + c;
		double r3 = c + a / b;
		double r4 = a % b + c;
		System.out.println("The results of double Operations are " + r1 + " , " + r2 + " , " + r3 + " and " + r4 );

	}
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		doubleOperations.calculation(a,b,c);
	}	
}