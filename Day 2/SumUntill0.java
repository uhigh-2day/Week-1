import java.util.Scanner;
class SumUntill0
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int sum = 0;
		System.out.print("Enter the Number: ");
		int num = input.nextInt();
		while (num >0 )
		{
			sum += num;
			System.out.println("Sum = "+sum);
			System.out.print("Enter the Number: ");
			num = input.nextInt();
			
		}
		System.out.println("Final Sum = "+sum);
	}
}