import java.util.Scanner;

public class firstUnique
{
    public static char[] uniqueCharacter(String str, int length)
    {
        char[] unique = new char[length];
        int index = 0;
        for(int i=0; i<length; i++)
        {
            char currCHaracter = str.charAt(i);
            boolean isUnique = true;
            for(int j=0; j<i;j++)
            {
                if(currCHaracter==str.charAt(j))
                {
                    isUnique=false;
                    break;
                }
            }
            if(isUnique)
            {
                unique[index] = str.charAt(i);
                index++;
            }
        }
        char[] result = new char[index];
        for(int k=0; k<index; k++)
        {
            result[k]=unique[k];
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String text = ip.nextLine();
        int len = text.length();
        char[] unique = firstUnique.uniqueCharacter(text,len);
        System.out.println("Unique characters are: ");
        for(char ch : unique)
        {
            System.out.print(ch + " ");
        }
    }
}
