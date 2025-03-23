import java.util.Scanner;
class OddEven
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = input.nextInt();
		for (int i = 1; i<=num; i++)
		{
			if (i%2==0)
			{
				System.out.println("Even Number: "+i);
			}
			else if (i%2 !=0)
			{
				System.out.println("Odd Nubmer: "+i);
			}
		}
	}
}

