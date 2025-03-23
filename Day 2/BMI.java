import java.util.Scanner;
class BMI
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Weight in kg: ");
		double weight = input.nextInt();
		System.out.print("Enter the height in cm: ");
		double height = input.nextInt();
		double heightinm = height/100;
		double BMI = weight/(Math.pow(heightinm,2));
		System.out.println(BMI);
		if (BMI <= 18.4)
		{
			System.out.println("Underweight");
		}
		else if(BMI > 18.5 && BMI < 25)
		{
			System.out.println("Normal");
		}
		else if(BMI > 25 && BMI < 40)
		{
			System.out.println("Overweight");
		}
		else if(BMI >=40)
		{
			System.out.println("Overweight");
		}
		else 
		{
			System.out.println("Error Detected");
		}
	}
}
		
		