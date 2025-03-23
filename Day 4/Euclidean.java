import java.util.Scanner;

public class Euclidean
{
    public static double distance(int x1, int y1, int x2, int y2)
    {
        return (Math.sqrt(Math.pow((x2-x1),2)) + Math.sqrt(Math.pow((y2-y1),2)));
    }
    public static int[] equation(int x1, int y1, int x2, int y2)
    {
        int[] result = new int[2];
        result[0] = (y2-y1)/(x2-x1);
        result[1] = y1 - result[0] * x1;
        return result;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the point x1: ");
        int x1 = input.nextInt();
        System.out.print("Enter the point y1: ");
        int y1 = input.nextInt();
        System.out.print("Enter the point x2: ");
        int x2 = input.nextInt();
        System.out.print("Enter the point y2: ");
        int y2 = input.nextInt();
        double Euclidean_distance = Euclidean.distance(x1,y1,x2,y2);
        int [] res = Euclidean.equation(x1,y1,x2,y2);
        System.out.println("Euclidean Distance: "+ Euclidean_distance);
        System.out.println("Slope: "+ res[0]+ " and y-intercept: "+res[1]);
    }
}
