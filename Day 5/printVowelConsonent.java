import java.util.Scanner;

public class printVowelConsonent
{
    public static char[][] print(String str)
    {
        int[] len = printVowelConsonent.check(str);
        int[] vowel = {97,101,105,111,117};
        char[][] print = new char[3][];
        int count1=0; int count2=0;int count3=0;
        for (int i=0; i<3; i++)
        {
            print[i] = new char[len[i]];
        }
        for(int j=0;j<str.length(); j++)
        {
            int ASCII = (int)str.charAt(j);
            boolean isVowel = false;
            for(int k=0; k<5; k++)
            {
                if(ASCII == vowel[k])
                {
                    print[0][count1] =str.charAt(j);
                    count1++;
                    isVowel = true;
                    break;
                }
            }
            if(!isVowel && ASCII<=122 && ASCII>=97)
            {
                print[1][count2] = str.charAt(j);
                count2++;
            }
            else if(!isVowel)
            {
                print[2][count3]=str.charAt(j);
                count3++;
            }
        }
        return print;
    }


    public static int[] check(String str)
    {
        int length = str.length();
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
            if(!isVowels && ASCII<=122 && ASCII>=97)
            {
                consonents++;
            }
            else if(!isVowels)
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
        String string = input.nextLine();
        String text = string.toLowerCase();
        int[] vowelconsonents = printVowelConsonent.check(text);
        System.out.println("No of Vowels are: "+vowelconsonents[0]);
        System.out.println("No of Consonants: "+vowelconsonents[1]);
        System.out.println("No of Digit/Special Characters and Spaces: "+vowelconsonents[2]);
        char[][] final_ans = printVowelConsonent.print(text);
        System.out.println("Vowels are: ");
        for(int i=0;i<vowelconsonents[0];i++)
        {
            System.out.print(final_ans[0][i] + " ");
        }
        System.out.println("\nConsonants are: ");
        for(int i=0;i<vowelconsonents[1];i++)
        {
            System.out.print(final_ans[1][i] + " ");
        }
        System.out.println("\nDigits/Special Characters are: ");
        for(int i=0;i<vowelconsonents[2];i++)
        {
            System.out.print(final_ans[2][i] + " ");
        }
    }
}
