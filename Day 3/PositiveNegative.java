import java.util.Scanner;
class PositiveNegative
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int[] number = new int[5];
        for (int i=0;i<5;i++)
        {
            System.out.print("Enter the "+ (i+1)+ " Number: ");
            number[i] = input.nextInt();
        }
        for (int i=0;i<5;i++)
        {
            if (number[i]>0)
            {
                System.out.println("The number is Positive Number");
            }
            else if(number[i]<0)
            {
                System.out.println("The number is Negative Number");
            }
            else if(number[i]==0)
            {
                System.out.println("The number is Zero");
            }
        }
    }
}