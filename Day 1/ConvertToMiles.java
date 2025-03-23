import java.util.Scanner;
class ConvertToMiles
{
	static double Conversion(double km)
	{
		double miles = 1.6 * km;
		return miles;
	}
	public static void main(String args[])
	{
		System.out.printf("Enter The Value in Kilometer: ");
		Scanner scanner = new Scanner(System.in);
		double kilometer = scanner.nextInt();
		double miles = ConvertToMiles.Conversion(kilometer);
		System.out.println("The total miles is " + miles + " mile for the given " + kilometer + " km");
	}
}
