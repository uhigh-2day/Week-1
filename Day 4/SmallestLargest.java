import java.util.Scanner;

public class SmallestLargest
{
    public static int[] findSmallestAndLargest(int number1, int number2, int number3)
    {
        int[] num = new int[2];
        num[0]  = Math.max(number1,Math.max(number2,number3));
        num[1] = Math.min(number1,Math.min(number2,number3));
        return num;
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Three Numbers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int[] number = SmallestLargest.findSmallestAndLargest(n1,n2,n3);
        System.out.print("The smallest number is "+number[1]+" and the largest number is "+number[0]);
    }
}
