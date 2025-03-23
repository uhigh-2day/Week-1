import java.util.Scanner;
class PowerFor
{
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = input.nextInt();
		System.out.print("Enter the Power: ");
		int power = input.nextInt();
		int result = 1;
		for (int i = 1; i<=power; i++)
		{
			result = result * num;
		}
		System.out.println("Result: "+ result);
	}
}