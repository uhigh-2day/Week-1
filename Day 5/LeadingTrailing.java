import java.util.Scanner;

class LeadingTrailing
{
    public static String Str(String str, int[] index)
    {
        String substring = "";
        for(int i=index[0]; i<=index[1]; i++)
        {
            substring += str.charAt(i);
        }
        return substring;
    }
    public static int[] String(String s, int length) {
        int[] startend = new int[2];
        int start = 0;
        int end = length - 1;

        while (start < length && s.charAt(start) == ' ') {
            start++;
        }
        startend[0] = start;

        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        startend[1] = end;

        return startend;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = input.nextLine();
        int length = str.length();
        int[] index = LeadingTrailing.String(str,length);
        String ans = LeadingTrailing.Str(str,index);
        System.out.println("String without Leading and Trailing spaces: "+ ans);
        String check = str.trim();
        if(ans.equals(check))
        {
            System.out.println("Both the methods returns same answers");
        }
        else {
            System.out.println("Both the methods return different answers");
        }

    }
}
