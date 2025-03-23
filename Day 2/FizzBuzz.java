import java.util.Scanner;
class FizzBuzz
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int num = 0;
		while(true)
		{
			System.out.print("Enter the Number: ");
			num = input.nextInt();
			if(num>0&&num%5==0||num%3==0)
			{
				break;
			}
			else 
			{
				System.out.println("Input Number: "+num);
			}
		}
		if (num%5==0 && num%3==0)
		{
			System.out.println("FizzBuzz");
		}
		else if(num%5 == 0)
		{
			System.out.println("Buzz");
		}
		else if (num%3==0)
		{
			System.out.println("Fizz");
		}
	}
}