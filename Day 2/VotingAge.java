import java.util.Scanner;
class VotingAge
{
	static void check(int age)
	{
		if(age>=18)
		{
			System.out.println("The person's age is "+ age + "and can vote.");
		}
		else 
		{
			System.out.println("The person's age is "+ age + " and cannot vote.");
		}
	}
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Age: ");
		int age = input.nextInt();
		VotingAge.check(age);
	}
}