import java.util.Scanner;
public class BMI_MD
{
    public static void main(String args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of Persons: ");
        int num = input.nextInt();
        double[][] person = new double[num][3];
        for(int i=0; i<num; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.println("Enter the Weight and Height of the "+(i+1)+" Person: ");
                person[i][j] = input.nextInt();
            }
        }
        for(int k=0; k<num; k++)
        {
            person[k][2] = person[k][0]/((person[k][1]/100)*(person[k][1]/100));
        }
        for(int k=0; k<num; k++)
        {
            for(int l=0; l<3; k++)
            {
                System.out.println("Weight of the "+(k+1)+"st Person is: "+person[k][0]+" and height is "+person[k][1]);
                if(person[k][3]<=18.4)
                {
                    System.out.println("BMI is "+person[k][3]+" and he is Underweight");
                }
                else if(person[k][3]<25 && person[k][3]>18.4)
                {
                    System.out.println("BMI is "+person[k][3]+" and he is Normal");
                }
                else if(person[k][3]<40 && person[k][3]>=25)
                {
                    System.out.println("BMI is "+person[k][3]+" and he is Overweight");
                }else if(person[k][3]>40)
                {
                    System.out.println("BMI is "+person[k][3]+" and he is Obese");
                }
                else
                {
                    System.out.println("Error Occurred: Unable to calculate BMI");
                }
            }
        }
    }
}