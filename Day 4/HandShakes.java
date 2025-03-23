import java.util.Scanner;
public class HandShakes
{
    static void Shakes(int n)
    {
        int max = (n*(n-1))/2;
        System.out.print("Total Number of Max Handshakes: "+max);
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Students: ");
        int n = input.nextInt();
        HandShakes.Shakes(n);
    }
}

