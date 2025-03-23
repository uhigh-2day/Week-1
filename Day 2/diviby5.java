import java.util.Scanner;
class diviby5
{
	static void check(int number)
	{
		if (number % 5 == 0)
		{
			System.out.println(" Is the number " + number + "divisible by 5? \nYES ");
		}
		else 
		{
			System.out.println("Is the number " + number + " divisible by 5? \nNO ");
		}
	}
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number you want to check? "); 
		int number = scanner.nextInt();
		diviby5.check(number);
	}
}
