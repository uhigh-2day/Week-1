import java.util.Scanner;
class NaturalNumber
{
	static void sum(int number)
	{
		int sum = 0;
		if(number>0)
		{
			for (int i=1;i<=number;i++)
			{
				sum += i;
			}
			System.out.println("The sum of " + number + " natural numbers is " + sum);
		}
		else 
		{
			System.out.println("The number " + number + " is not a natural number");
		}
	}
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = input.nextInt();
		NaturalNumber.sum(num);
	}
}