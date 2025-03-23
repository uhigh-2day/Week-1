import java.util.*;

public class StringChar
{
    static char[] character (String str)
    {
        int length = str.length();
        char[]  ch = new char[length];
        System.out.println("CharAt() function: ");
        for (int i=0; i<length; i++)
        {
            ch[i] = str.charAt(i);
            System.out.print(ch[i]+"  ");
        }
        return ch;
    }

    static boolean check (char[] s, String str)
    {
        int length = str.length();
        char[] builtin = new char[length];
        builtin = str.toCharArray();
        System.out.println("\ntoCharArray() function: ");
        for(int i=0; i<length; i++)
        {
            System.out.print(builtin[i]+ "  ");
            if(s[i]!=builtin[i])
            {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        char[] character = StringChar.character(str);
        boolean check = StringChar.check(character, str);
        if(check)
        {
            System.out.println("\nBoth returns same result");
        }
        else
        {
            System.out.println("Both returns different values");
        }

    }
}
