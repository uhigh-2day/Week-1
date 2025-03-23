import java.util.Scanner;
class PositiveNegative
{

    static void check(int num)
    {
        if (num>0)
        {
            System.out.println("Positive");
        }
        else if (num<0)
        {
            System.out.println("Negative");
        }
        else if (num == 0)
        {
            System.out.println("Zero");
        }
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the Number: ");
        int number = input.nextInt();
        PositiveNegative.check(number);
    }
}