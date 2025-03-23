import java.util.Scanner;
class GreatestFactor
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = input.nextInt();
		int greatestFactor = 1;
		for(int i = num-1; i>0; i--)
		{
			if (num%i == 0)
			{
				greatestFactor = i;
				break;
			}
		}
		System.out.println("Greatest Factor is: " + greatestFactor);
	}
}