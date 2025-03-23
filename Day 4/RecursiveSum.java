import java.util.Scanner;

public class RecursiveSum
{
    public static int sum(int n, int s)
    {
        s += n;
        if (n==0)
        {
            return s;
        }
        else
        {
            return sum(n-1,s);
        }

    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int su = 0;
        System.out.print("Enter the Nubmer: ");
        int number = input.nextInt();
        int sum = RecursiveSum.sum(number,su);
        System.out.print("Recursive Sum is "+sum+" and Formula Sum is "+(number*(number+1)/2));
    }
}
