import java.util.Scanner;
class IntOperations
{
	static void calculation(int a, int b, int c)
	{
		int r1 = a + b *c;
		int r2 = a * b + c;
		int r3 = c + a / b;
		int r4 = a % b + c;
		System.out.println("The results of Int Operations are " + r1 + " , " + r2 + " , " + r3 + " and " + r4 );

	}
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		IntOperations.calculation(a,b,c);
	}	
}