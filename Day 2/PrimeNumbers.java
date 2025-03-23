import java.util.Scanner;
class PrimeNumbers
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = input.nextInt();
		int count = 0;
		for(int i=1; i<=num; i++)
		{
			if(num%i == 0)
			{
				count++;
			}
		}
		if (count==2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not a Prime Number");
		}
	}
}