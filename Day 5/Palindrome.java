import java.util.Scanner;

public class Palindrome
{
    public static boolean check(String str)
    {
        int end = str.length();
        int start = 0;int count = 0;
        while(start!=str.length())
        {
            if(str.charAt(start)!=str.charAt(end-1))
            {
                count++;
            }
            start++;
            end--;
        }
        if(count!=0) {
            return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = input.nextLine();
        if(Palindrome.check(str)){
            System.out.print("String is Palindrome");
        }
        else{
            System.out.print("String is not Palindrome");
        }
    }
}
