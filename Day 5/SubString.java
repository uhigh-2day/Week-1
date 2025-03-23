import java.util.Scanner;

public class SubString
{
    public static String String(String s, int start, int end)
    {
        String charAt ="";
        for (int i=start; i<end; i++)
        {
            charAt += s.charAt(i);
        }
        return charAt;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        System.out.print("Enter the Starting Index: ");
        int start = sc.nextInt();
        System.out.print("Enter the Ending Index: ");
        int end = sc.nextInt();
        String subString = SubString.String(str,start,end);
        System.out.println("Substring using charAt(): "+ subString);
        System.out.print("Substring using charAt(): "+ str.substring(start,end));

    }
}
