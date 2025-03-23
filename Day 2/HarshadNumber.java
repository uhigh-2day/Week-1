import java.util.Scanner;
class HarshadNumber
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
		if (x%sum==0)
		{
			System.out.print("It is a Harshad Number");
		}
		else 
		{
			System.out.print("It is not a Harshad Number");
		}
	}
}
			