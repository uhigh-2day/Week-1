import java.util.Scanner;

public class Factors
{
    public static int[] factor(int n, int count)
    {
        int[] fact = new int[count];
        int temp = 0;
        for(int i=1; i<n; i++)
        {
            if (n%i==0)
            {
                fact[temp] = i;
                temp++;
            }
        }
        return fact;
    }
    public static int size(int n)
    {
        int count=0;
        for (int i=1; i<n; i++)
        {
            if (n%i==0)
            {
                count++;
            }
        }
        return count;
    }
    public static void Sum(int[] factors,int count)
    {
        int sum = 0;
        int sq_sum= 0;
        int prod = 1;
        for(int i=0; i<count; i++)
        {
            sum += factors[i];
            sq_sum += Math.pow(factors[i],2);
            prod *= factors[i];
        }
        System.out.print("Sum of Factors: "+sum+" ,Square sum of Factors: "+sq_sum+" and Product of Factors: "+prod);
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        int count = Factors.size(num);
        int[] factors = Factors.factor(num,count);
        Factors.Sum(factors, count);
    }
}
