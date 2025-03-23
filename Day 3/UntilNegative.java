import java.util.Scanner;
public class UntilNegative
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int[] num = new int[10];
        int sum = 0;
        int count = 0;
        int in = 0;
        while (true)
        {
            if(in>=10)
            {
                break;
            }
            System.out.print("Enter the Number: ");
            num[in]= input.nextInt();
            if(num[in]<=0)
            {
                break;
            }
            in++;
            count++;
        }
        System.out.print("The Numbers Entered are: ");
        for(int i=0; i<count; i++)
        {
            sum += num[i];
            System.out.print(num[i] + " ");
        }
        System.out.println("\nThe sum of all the Numbers are: " + sum);
    }
}
