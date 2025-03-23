import java.util.Scanner;
public class AgeHeight {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int[] age = new int[3];
        int[] height = new int[3];
        int youngest = 10000;
        int tallest = 0;
        for(int i=0; i<3; i++)
        {
            System.out.print("Enter the Age: ");
            age[i]= input.nextInt();
            System.out.print("Enter the Height: ");
            height[i]= input.nextInt();
        }
        for(int j=0; j<3; j++)
        {
            if(age[j]<youngest)
            {
                youngest= age[j];
            }
            if(height[j]>tallest)
            {
                tallest= height[j];
            }
        }
        System.out.println("Youngest among the Three was "+ youngest +" and tallest among the Three was "+ tallest);
    }
}
