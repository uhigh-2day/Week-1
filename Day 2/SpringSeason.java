import java.util.Scanner;
class SpringSeason 
{
	static void check (int date, int month)
	{
		if (month == 3 && date >=20)
		{
			System.out.println("It's a Spring Season");
		}
		else if (month == 6 && date <=20)
		{
			System.out.println("It's a Spring Season");
		}
		else if (month > 3 && month < 6)
		{
			System.out.println("It's a Spring Season");
		}
		else 
		{
			System.out.println("Not a Spring Season");
		}
	}
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the date: ");
		int date = input.nextInt();
		System.out.print("\nEnter the Month: ");
		int month = input.nextInt();
		SpringSeason.check(date,month);
	}
}