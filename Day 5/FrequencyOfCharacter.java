import java.util.Scanner;

public class FrequencyOfCharacter
{
    public static int[][] result(String text)
    {
        int length = text.length();
        int[] freq = new int[256];

        //finding the frequency of characters

        for(int i=0; i<length; i++)
        {
            freq[text.charAt(i)]++;
        }


        //finding the used characters
        int uniqueCharacter=0;
        for(int i=0; i<256; i++)
        {
            if(freq[i]>0)
            {
                uniqueCharacter++;
            }
        }

        //storing the character and frequency
        int[][] result = new int[uniqueCharacter][2];
        int index = 0;
        for(int i=0; i<256; i++)
        {
            if(freq[i]>0)
            {
                result[index][0]= i;
                result[index][1]= freq[i];
                index++;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = input.nextLine();
        int[][] result = FrequencyOfCharacter.result(str);
        for(int[] ch : result)
        {
            System.out.println("Characters: "+(char)(ch[0])+" and Frequency: "+ch[1]);
        }

    }
}
