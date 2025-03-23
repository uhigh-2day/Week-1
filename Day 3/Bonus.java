import java.util.Scanner;
public class Bonus
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        double[] salary = new double[10];
        double[] year = new double[10];
        double[] bonusAMT = new double[10];
        double bonus = 0;
        for(int i=0; i<2; i++)
        {
            System.out.print("Enter the Salary of "+(i+1)+"st person: ");
            salary[i] = input.nextInt();
            System.out.print("Enter the Year of Experiences: ");
            year[i] = input.nextInt();
        }
        for(int i=0; i<2; i++)
        {
            if (year[i] >= 5)
            {
                bonus = salary[i] + ((salary[i]*5)/100);
                bonusAMT[i] = bonus;
            }
            else if (year[i] < 5)
            {
                bonus = salary[i] + ((salary[i]*2)/100);
                bonusAMT[i] = bonus;
            }
        }
        System.out.println("Total Salary Paid are: ");
        for(int i=0; i<2; i++)
        {
            System.out.println(bonusAMT[i] + " ");
        }
    }
}
