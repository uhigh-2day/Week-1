import java.util.Scanner;
class Marks
{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of Persons: ");
        int num = input.nextInt();
        double[][] student = new double[num][4];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter the marks of  of Physics, Chemistry and Maths of " + (i + 1) + "st Student: ");
                student[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < num; i++) {
            student[i][3] = (student[i][0] + student[i][1] + student[i][2]) / 3;
        }
        for (int i = 0; i < num; i++)
        {
            double percentage = student[i][3];
            if(percentage>=80)
            {
                System.out.println("GRADE: A");
                System.out.println("Level 4, above agency-normalized standards");
            }
            else if(percentage<80 && percentage>=70)
            {
                System.out.println("GRADE: B");
                System.out.println("Level 3, at agency-normalized standards");
            }
            else if(percentage<70 && percentage>=60)
            {
                System.out.println("GRADE: C");
                System.out.println("Level 2, below, but approaching agency-normalized standards");
            }
            else if(percentage<60 && percentage>=50)
            {
                System.out.println("GRADE: D");
                System.out.println("Level 1, well below agency-normalized standards");
            }
            else if(percentage<50 && percentage>=40)
            {
                System.out.println("GRADE: E");
                System.out.println("Level 1, too below agency-normalized standards");
            }
            else if(percentage<40)
            {
                System.out.println("Remedial standards");
            }
        }
    }
}