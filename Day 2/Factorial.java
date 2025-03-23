import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = input.nextInt();
		int fact = 1;
		while (num!=0)
		{
			fact = fact * num;
			num--;
		}
		System.out.println("Factorial: "+ fact);
	}
}