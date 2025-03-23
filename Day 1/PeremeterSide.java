import java.util.Scanner;
class PeremeterSide
{
	static void Side(double peremeter)
	{
		double side = peremeter /4;
		System.out.println("The length of the side is " + side + " whose perimeter is " + peremeter);
	}
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		double perimeter = scanner.nextDouble();
		PeremeterSide.Side(perimeter);
	}
}