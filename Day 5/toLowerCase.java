import java.util.Scanner;

public class toLowerCase
{
    public static String LowerCase(String str) {
        String lower = "";
        int ASCII;
        int temp;
        int length = str.length();
        for (int i = 0; i < length; i++)
        {
            if ((int) str.charAt(i) < 90 && (int) str.charAt(i) > 65)
            {
                temp = (int)str.charAt(i);
                ASCII = temp + 32;
                lower += (char)ASCII;
            }
            else
            {
                lower+=str.charAt(i);
            }
        }
        return  lower;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = input.nextLine();
        String LowerCase = toLowerCase.LowerCase(str);
        System.out.println("Converted String using ASCII: "+ LowerCase);
        System.out.println("Converted String using toLowerCase: "+ str.toLowerCase());
        if (LowerCase.equals(str.toLowerCase()))
        {
            System.out.println("Both return same output");
        }

    }
}
