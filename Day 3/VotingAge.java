import java.util.Scanner;
class VotingArray
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int[] age = new int[10];
        for (int i=0;i<10;i++) {
            while (true) {
                System.out.print("Enter the age of " + (i + 1) + "st Student: ");
                age[i] = input.nextInt();
                if (age[i] >= 0) {
                    break;
                }
                else
                {
                    System.out.println("Invalid Age, Enter the age again");
                }
            }
        }
        for (int i=0;i<10;i++)
        {
            if (age[i]>=18)
            {
                System.out.println(" The student with the age "+age[i] + " can vote.");
            }
            else
            {
                System.out.println(" The student with the age "+age[i] + " cannot vote.");
            }
        }
    }
}