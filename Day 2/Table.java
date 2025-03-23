import java.util.Scanner;
class Table
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number b/w 6 to 9: ");
		int num = input.nextInt();
		int value = 1;
		for (int i =1; i<=10; i++)
		{
			value = i * num;
			System.out.println(num +" * "+i+" = "+value);
		}
	}
}
		