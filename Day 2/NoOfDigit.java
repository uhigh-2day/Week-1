import java.util.Scanner;
class NoOfDigit
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = input.nextInt();
		int count = 0;
		while (num!=0)
		{
			num = num/10;
			count++;
		}
		System.out.println("Total Number of Digits in Integer: "+count);
	}
}