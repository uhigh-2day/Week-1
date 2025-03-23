import java.util.Scanner;
class CounterFor
{
	static void timer(int num)
	{
		if (num == 1)
		{
			System.out.println("Counter is 1");
		}
		for (int i = num; i>0; i--)
		{
			System.out.println(i);
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