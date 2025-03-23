import java.util.Scanner;
class ArmstrongNumber
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = input.nextInt();
		double sum = 0;
		int x=0;
		int verify = num;
		while (num!=0)
		{
			x = (num%10);
			sum = sum + (Math.pow(x,3));
			num = num/10;
		}
		if (verify == sum)
		{
			System.out.println("Armstrong Number");
		}
		else 
		{
			System.out.println("Not an Armstrong Number");
		}
	}
}