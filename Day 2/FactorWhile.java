import java.util.Scanner;
class FactorWhile
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = input.nextInt();
		int i = 1;
		while(i<num)
		{
			if (num%i == 0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}