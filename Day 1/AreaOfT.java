import java.util.Scanner;
class AreaOfT
{
	static void Calculation(double b, double h)
	{
		double cm = 0.5*b*h;
		double inch = 0.5* (b/2.54) * (h/2.54);
		System.out.println("The Area of the triangle in sq in is " + inch +" and sq cm is " +cm);
	}
	public static void main (String args[])
	{
		Scanner scanner = new Scanner(System.in);
		double base = scanner.nextDouble();
		double height = scanner.nextDouble();
		AreaOfT.Calculation(base,height);
	}
}