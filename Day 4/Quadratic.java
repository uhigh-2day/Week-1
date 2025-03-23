import java.util.Scanner;

public class Quadratic
{
    public static void root(int a, int b, int c)
    {
        double delta = Math.pow(b,2) + (4*a*c);
        if(delta>0)
        {
            double root1 = (-b + Math.sqrt(delta))/(2*a);
            double root2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.print("Roots are: "+root1+" and "+root2);
        }
        else if (delta ==0)
        {
            double root = (double)(-b/(2*a));
            System.out.print("Roots are: "+ root);
        }
        else
        {
            System.out.print("No Roots Available");
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();
        System.out.print("Enter the value of b: ");
        int b = input.nextInt();
        System.out.print("Enter the value of c: ");
        int c = input.nextInt();
        Quadratic.root(a,b,c);
    }
}
