import java.util.Scanner;
class yardmiles
{
	static void conversion(double feet)
	{
		double yard = feet / 3;
		double miles = yard / 1760;
		System.out.println("The distance in yards is " + yard + " while the distance in miles is " + miles);
	}
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		double Distanceinfeet = scanner.nextDouble();
		yardmiles.conversion(Distanceinfeet);
	}
}