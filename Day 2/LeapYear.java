import java.util.Scanner;
class LeapYear
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Year: ");
		int year = input.nextInt();
		if (year>=1582)
		{
			if((year%4==0 && year%100!=0) || year%400 == 0)
			{
			System.out.println("It is a Leap Year");
			}
			else 
			{
				System.out.println("It is not a Leap Year");
			}
		}
		else
		{
			System.out.println("Given year is not Vaild");
		}
	}
}
		