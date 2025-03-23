import java.util.Scanner;
public class SimpleInterest
{
    static void Interest(int P, int R, int T)
    {
        double Interest = (P*R*T)/100;
        System.out.print("The Simple Interest is: "+Interest+" for Principal: "+P+" Rate: "+R+" and Time: "+T);
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principal: ");
        int P = input.nextInt();
        System.out.print("Enter the Rate: ");
        int R = input.nextInt();
        System.out.print("Enter the Time in Years: ");
        int T = input.nextInt();
        SimpleInterest.Interest(P,R,T);
        input.close();
    }
}
