import java.util.Scanner;
class forNatural
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = input.nextInt();
		int sumwhile = 0;
		int sumformula = 0;
		int buffer = num;
		if (num>0)
		{
			for(int i=num; i>0; i--)
			{	
				sumwhile += i;
			}
			sumformula = (buffer*(buffer+1))/2;
			System.out.println("Sum of n Naturnal Numbers using while-loop is: "+sumwhile+" and sum of n Natural Number using the Formula is: "+sumformula);
		}
		else 
		{ 
			System.out.println("Not a natural number");
		}
	}
	
}
		