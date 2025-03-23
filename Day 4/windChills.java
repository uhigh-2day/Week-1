import java.util.Scanner;

public class windChills
{
    public static double calculateWindChill(double wind, double temp)
    {
        double windChills = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(wind,0.16);
        return windChills;
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Temperature: ");
        double temp = input.nextDouble();
        System.out.print("Enter the Wind Speed: ");
        double wind = input.nextDouble();
        double Chills = windChills.calculateWindChill(wind,temp);
        System.out.print("Wind Chills Temperature are: "+Chills);
        input.close();
    }
}
