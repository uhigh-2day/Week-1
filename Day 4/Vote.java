import java.util.Scanner;
class VotingAge
{
    public static boolean canStudentVote(int age)
    {
        return age >= 18;
    }
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] age = new int[10];
        for (int j=0; j<10; j++)
        {
            System.out.print("Enter the age of "+(j+1)+" st student: ");
            age[j] = input.nextInt();
        }
        for (int i=0; i<10; i++)
        {
            boolean check = VotingAge.canStudentVote(age[i]);
            if (check)
            {
                System.out.println("The student's age is "+ age[i] + "and can vote.");
            }
            else
            {
                System.out.println("The student's age is "+ age[i] + " and cannot vote.");
            }
        }
    }
}