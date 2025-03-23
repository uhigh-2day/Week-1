import java.util.Scanner;
class Bonus
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Salary: ");
		int salary = input.nextInt();
		System.out.print("Enter the Year of Service: ");
		int year = input.nextInt();
		if (year>5)
		{
			int bonusAMT = salary +((salary*5)/100);
			System.out.println("Bonus Amount: " + bonusAMT);
		}
		else
		{ 
			System.out.println("Amount without Bonus as Year of Experience <5: "+salary);
		}
	}
}