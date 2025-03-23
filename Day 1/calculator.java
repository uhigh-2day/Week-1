import java.util.Scanner;
class calculator
{
	static void Calculation(float number1, float number2)
	{
		float add = number1 + number2;
		float sub = number1 - number2;
		float mul = number1 * number2;
		float div = number1 / number2;
		System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + " and " + number2 + " is " + add +", "+ sub +", "+ mul + " and " + div);
	}
	public static void main (String args[])
	{
		Scanner scanner = new Scanner(System.in);
		float num1 = scanner.nextFloat();
		float num2 = scanner.nextFloat();
		calculator.Calculation(num1,num2);
	}
}