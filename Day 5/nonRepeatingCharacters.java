import javax.swing.*;
import java.util.Scanner;

public class nonRepeatingCharacters
{
    public static char getResult(String str)
    {
        int length = str.length();
        char[] characterFreq= new char[256];
        for(int i=0; i<length; i++)
        {
            characterFreq[str.charAt(i)]++;
        }
        for(int i=0; i<length; i++)
        {
            if(characterFreq[str.charAt(i)]==1)
            {
                return str.charAt(i);
            }
        }
        return '\0';
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String text = input.nextLine();
        System.out.println("First non-repeating string is: "+ nonRepeatingCharacters.getResult(text));

    }
}
