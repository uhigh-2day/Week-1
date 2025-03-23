import java.util.Scanner;

public class toUpperCase
{
    public static String UpperCase(String str) {
        String upper = "";
        int ASCII;
        int temp;
        int length = str.length();
        for (int i = 0; i < length; i++)
        {
            if ((int) str.charAt(i) < 122 && (int) str.charAt(i) > 97)
            {
                temp = (int)str.charAt(i);
                ASCII = temp - 32;
                upper += (char)ASCII;
            }
            else
            {
                upper+=str.charAt(i);
            }
        }
        return  upper;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = input.nextLine();
        String UpperCase = toUpperCase.UpperCase(str);
        System.out.println("Converted String using ASCII: "+ UpperCase);
        System.out.println("Converted String using toUpperCase: "+ str.toUpperCase());
        if (UpperCase.equals(str.toUpperCase()))
        {
            System.out.println("Both return same output");
        }

    }
}
