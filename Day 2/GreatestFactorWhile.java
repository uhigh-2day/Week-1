import java.util.Scanner;
class GreatestFactorWhile
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = input.nextInt();
		int greatestFactor = 1;
		int i = num-1;
		while(i!=0)
		{
			if (num%i == 0)
			{
				greatestFactor = i;
				break;
			}
			i--;
		}
		System.out.println("Greatest Factor is: " + greatestFactor);
	}
}