import java.util.Scanner;
class AbundantNumber
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = input.nextInt();
		int sum = 0;
		int x = num;
		while (num!=0)
		{
			sum = sum + (num%10);
			num = num/10;
		}
		if (sum>x)
		{
			System.out.print("It is a Abundant Number");
		}
		else 
		{
			System.out.print("It is not a Abundant Number");
		}
	}
}
			