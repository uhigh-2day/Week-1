import java.util.Scanner;
public class ReverseNumber
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        int buffer = num;int print = num;
        int count = 0;
        while (buffer != 0)
        {
            buffer = buffer / 10;
            count++;
        }
        int[] digit = new int[count];
        for (int i = 0; i < count; i++)
        {
            digit[i] = num % 10;
            num = num / 10;
        }
        System.out.print("The Given Number was: "+print+" and the Reversed Number is: ");
        for (int j = 0; j < count; j++)
        {
            System.out.print(digit[j]);
        }

    }
}
