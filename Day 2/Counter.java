import java.util.Scanner;
class Counter
{
	static void timer(int num)
	{
		if (num == 1)
		{
			System.out.println("Counter is 1");
		}
		while (num != 0)
		{
			System.out.println(num);
			num--;
		}
	}
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int number = input.nextInt();
		Counter.timer(number);
	}
}