import java.util.Scanner;

public class Calender
{
    public static boolean LeapCheck(int year)
    {
        if (year>=1582)
        {
            return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        }
        return false;
    }
    public static int day(int month, int year)
    {
        int[] day = {31,28,31,30,31,30,
                31,30,31,30,31,30};
        if(month==2 && Calender.LeapCheck(year))
        {
            return 29;
        }
        return day[month-1];
    }
    public static int dayofWeek(int m, int y)
    {
        int d=1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
        return d0;
    }
    public static String month(int m)
    {
        String[] month = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December"};
        return month[m+1];
    }
    public static void display(int year, int month)
    {
        // display first line
        System.out.println(Calender.month(month)+"  "+year);

        // display weeks
        String[] week = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
        for(int i=0;i<7; i++)
        {
            System.out.print(week[i] + " ");
        }
        System.out.print("\n");

        //display dates
        int start = Calender.dayofWeek(month,year);
        int temp1 = start;
        while(start!=0)
        {
            System.out.print("    ");
            start--;
        }
        int temp = Calender.day(month,year);
        for(int currDate =1; currDate<=temp; currDate++)
        {
            int change = temp1 + currDate;

            if (change%7==0)
            {
                System.out.println("\n");
            }
            System.out.print("   "+currDate);
        }

    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Month: ");
        int month = input.nextInt();
        System.out.print("Enter the Year: ");
        int year = input.nextInt();
        Calender.display(year, month);


    }
}
