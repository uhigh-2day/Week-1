import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.Scanner;
public class NoOfRounds
{
    static void Rounds(int side1, int side2, int side3)
    {
        double perimeter = (side1+side2+side3);
        double rounds = 5000/perimeter;
        System.out.print("Number of Rounds: "+Math.floor(rounds));
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 3 sides of the Triangle (in Meters): ");
        int s1 = input.nextInt();
        int s2 = input.nextInt();
        int s3 = input.nextInt();
        NoOfRounds.Rounds(s1,s2,s3);
    }
}
