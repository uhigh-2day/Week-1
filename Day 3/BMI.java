import java.util.Scanner;
public class BMI
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of Persons: ");
        int num = input.nextInt();
        double[] weight = new double[num];
        double[] height = new double[num];
        double[] BMI = new double[num];
        String[] arr = new String[num];
        for (int i=0; i<num; i++)
        {
            System.out.print("Enter the Weight: ");
            weight[i] = input.nextDouble();
            System.out.print("Enter the Height");
            height[i] = input.nextDouble();
        }
        for(int j=0; j<num; j++)
        {
            BMI[j] = weight[j]/((height[j]/100)*(height[j]/100));
        }
        for(int k=0; k<num; k++)
        {
            System.out.println("Weight of the "+(k+1)+"st Person is: "+weight[k]+" and height is "+height[k]);
            if(BMI[k]<=18.4)
            {
                System.out.println("BMI is "+BMI[k]+" and he is Underweight");
            }
            else if(BMI[k]<25 && BMI[k]>18.4)
            {
                System.out.println("BMI is "+BMI[k]+" and he is Normal");
            }
            else if(BMI[k]<40 && BMI[k]>=25)
            {
                System.out.println("BMI is "+BMI[k]+" and he is Overweight");
            }else if(BMI[k]>40)
            {
                    System.out.println("BMI is "+BMI[k]+" and he is Obese");
            }
            else
            {
                System.out.println("Error Occurred: Unable to calculate BMI");
            }
        }
    }
}
