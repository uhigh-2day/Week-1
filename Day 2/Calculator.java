import java.util.Scanner;
class Calculator
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the First Number: ");
		double a = input.nextInt();
		System.out.print("Enter the Second Number: ");
		double b = input.nextInt();
		System.out.print("Enter the Operation you want to Perform: ");
		String operator = input.next();
		switch (operator)
		{
			case "+":
				System.out.print(a+b);
				break;
			case "-":
				System.out.print(a-b);
				break;
			case "*":
				System.out.print(a*b);
				break;
			case "/":
				System.out.print(a/b);
				break;
			default:
				System.out.print("Invalid Operator");
				break;
		}
	}
}
			