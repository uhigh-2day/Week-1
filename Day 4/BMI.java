import java.util.Scanner;

public class BMI
{
    public static void BMI(double weight, double height, int num)
    {
        double bmi = weight/((height)/100*(height/100));
        System.out.println((num+1)+"st Person");
        if(bmi<=18.4)
        {
            System.out.println("BMI is "+bmi+" and he is Underweight");
        }
        else if(bmi<25 && bmi>18.4)
        {
            System.out.println("BMI is "+bmi+" and he is Normal");
        }
        else if(bmi<40 && bmi>=25)
        {
            System.out.println("BMI is "+bmi+" and he is Overweight");
        }else if(bmi>40)
        {
            System.out.println("BMI is "+bmi+" and he is Obese");
        }
        else
        {
            System.out.println("Error Occurred: Unable to calculate BMI");
        }

    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[][] person = new double[10][3];
        for(int i=0; i<10; i++)
        {
            for(int j=0; j<2; j++)
            {
                if(j==0)
                {
                    System.out.println("Enter the Weight of the " + (i + 1) + " Person: ");
                }
                else if (j==1)
                {
                    System.out.println("Enter the Height of the "+(i+1)+" Person: ");
                }
                person[i][j] = input.nextInt();
            }
        }
        for(int k=0; k<10; k++)
        {
            BMI.BMI(person[k][0],person[k][1],k);
        }
    }
}
