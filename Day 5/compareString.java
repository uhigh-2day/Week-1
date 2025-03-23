import java.util.Scanner;

public class compareString
{
    public static boolean charAt(String s1, String s2)
    {
        int count = 0;
        int length = s1.length();
        for(int i=0; i<length; i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            {
                count++;
            }
        }
        return count == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First String: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the Second String: ");
        String str2 = sc.nextLine();
        boolean ans = compareString.charAt(str1, str2);
        if (ans) {
            System.out.println("Strings are identical");
        } else {
            System.out.println("Strings are not identical");
        }
        if(str1.equals(str2)==ans)
        {
            System.out.println("Both equals() and charAt methods return same result");
        }
        sc.close();
    }
}
