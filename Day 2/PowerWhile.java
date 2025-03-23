import java.util.Scanner;
class PowerWhile
{
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = input.nextInt();
		System.out.print("Enter the Power: ");
		int power = input.nextInt();
		int result = 1;
		while (power!=0)
		{
			result = result * num;
			power--;
		}
		System.out.println("Result: "+ result);
	}
}