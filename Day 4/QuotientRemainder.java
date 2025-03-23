import java.util.Scanner;

public class QuotientRemainder
{
    public static int[] findRemainderAndQuotient(int number, int divisor)
    {
        int[] num = new int[2];
        num[0] = number/divisor;
        num[1] = number%divisor;
        return num;
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the Divisor: ");
        int num2 = input.nextInt();
        int[] ans = QuotientRemainder.findRemainderAndQuotient(num1,num2);
        System.out.print("The Remainder is "+ans[1]+" and the Quotient is "+ans[0]);
        input.close();
    }
}
