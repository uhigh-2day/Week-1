import java.util.Scanner;
public class Table
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int[] number = new int[10];
        System.out.print("Enter the Number for which you want to find the Table: ");
        int table = input.nextInt();
        for(int i=0; i<10; i++)
        {
            number[i] = table * (i+1);
        }
        for(int i=0; i<10; i++)
        {
            System.out.println(table +" * "+(i+1)+" = "+number[i]);
        }
    }
}
