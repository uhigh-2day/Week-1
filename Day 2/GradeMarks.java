import java.util.Scanner;
class GradeMarks
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the marks for Physics: ");
		int physics = input.nextInt();
		
		System.out.print("Enter the marks for Chemistry: ");
		int chemistry = input.nextInt();
		
		System.out.print("Enter the marks for Maths: ");
		int maths = input.nextInt();
		
		int total = physics + chemistry +maths;
		double avg = total/3;
		
		double percentage = ((double)total/300)*100;
		System.out.println("Average Marks: "+avg);
		
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