import java.util.Scanner;

public class FiveNumber
{
    public static void isPositive(int n)
    {
        if(n==0)
        {
            System.out.println("It is Zero");
        }
        else if(n>0)
        {
            System.out.print(n+ " is a Positive Number. ");
            FiveNumber.isEven(n);
        }
        else
        {
            System.out.println(n+" is a Negative Number");
        }
    }
    public static void isEven(int n)
    {
        if(n%2==0)
        {
            System.out.println("It is an Even Number");
        }
        else
        {
            System.out.println("It is an Odd Number");
        }
    }
    public static void compare(int n, int m)
    {
        if(n>m)
        {
            System.out.println(n+" is greater than "+m);
        }
        else if(m>n)
        {
            System.out.println(n+" is smaller than "+m);
        }
        else if (n==m)
        {
            System.out.println(n+"");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the " + (i + 1) + " Numbers: ");
            num[i] = input.nextInt();
        }
        for (int j = 0; j < 5; j++)
        {
            FiveNumber.isPositive(num[j]);
        }
        FiveNumber.compare(num[0],num[4]);
    }
}
