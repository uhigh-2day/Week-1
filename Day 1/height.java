import java.util.Scanner;
class height
{
	static void conversion(double cm)
	{
		double inch = cm / 2.54;
		double foot = inch / 12;
		System.out.println("Your Height in cm is" + cm + " while in feet is " + foot + " and inches is " + inch );
	}
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		double cm = scanner.nextDouble();
		height.conversion(cm);
	}
}

		