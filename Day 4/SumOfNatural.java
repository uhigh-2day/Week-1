import java.util.Scanner;
public class SumOfNatural
{
    static void sum(int n)
    {
        int sum = 0;
        for (int i=0; i<=n; i++)
        {
            sum += i;
        }
        System.out.print("The sum of n Natural Numbers are: "+sum);
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        SumOfNatural.sum(num);
    }
}
