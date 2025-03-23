import java.util.Scanner;

public class vowelsConsonent
{
    public static int[] check(String str)
    {
        int length = str.length();
        str.toLowerCase();
        int ASCII;
        int[] vowel = {97,101,105,111,117};
        int [] check = new int[3];
        int vowels = 0; int consonents = 0; int notWords = 0;
        for (int i=0; i<length;i++)
        {
            ASCII = (int)str.charAt(i);
            boolean isVowels = false;
            for(int j=0; j<5; j++)
            {
               if(ASCII == vowel[j])
               {
                   vowels++;
                   isVowels = true;
                   break;
               }
            }
            if(isVowels==false && ASCII<=122 && ASCII>=97)
            {
                consonents++;
            }
            else if(isVowels == false)
            {
                notWords++;
            }
        }
        check[0]=vowels;
        check[1]=consonents;
        check[2]=notWords;
        return check;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String text = input.nextLine();
        int[] vowelconsonents = vowelsConsonent.check(text);
        System.out.println("No of Vowels: "+vowelconsonents[0]);
        System.out.println("No of Consonants: "+vowelconsonents[1]);
        System.out.println("No of Digit/Special Characters: "+vowelconsonents[2]);

    }
}
