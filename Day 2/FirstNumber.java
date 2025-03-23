import java.util.Scanner;
class FirstNumber
{
	static void check(int num1, int num2, int num3)
	{
		if (num1<num2 && num1<num3)
		{
			System.out.println("Is the first number the smallest?  \nYES ");
		}
		else 
		{
			System.out.println("Is the first number the smallest?  \nNO ");
		}
	}
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number 1: "); 
		int number1 = scanner.nextInt();
		System.out.println("Enter the number 2: "); 
		int number2 = scanner.nextInt();
		System.out.println("Enter the number 3: ");
		int number3 = scanner.nextInt();

		FirstNumber.check(number1,number2,number3);
	}
}
