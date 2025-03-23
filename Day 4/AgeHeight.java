import java.util.Scanner;
public class AgeHeight
{
    public static int height(int[] height)
    {
        return Math.max(height[0],Math.max(height[1],height[2]));

    }
    public static int age(int[] age)
    {
        return Math.min(age[0],Math.min(age[1],age[2]));
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] age = new int[3];
        int[] height = new int[3];
        for(int i=0; i<3; i++)
        {
            System.out.print("Enter the Age: ");
            age[i]= input.nextInt();
            System.out.print("Enter the Height: ");
            height[i]= input.nextInt();
        }
        int youngest = AgeHeight.age(age);
        int tallest = AgeHeight.height(height);
        System.out.println("Youngest among the Three was "+ youngest +" and tallest among the Three was "+ tallest);
    }
}
