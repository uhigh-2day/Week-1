import java.util.Scanner;

public class anagrams
{
    public static boolean check(String str1, String str2)
    {
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];
        int check=0;
        int len1 = str1.length();
        int len2 = str2.length();
        if(len1==len2) {
            for (int i = 0; i < len1; i++) {
                freq1[str1.charAt(i)]++;
            }
            for (int i = 0; i < len2; i++) {
                freq2[str2.charAt(i)]++;
            }
            for(int i=0;i<256;i++)
            {
                if(freq1[i]!=freq2[i])
                {
                    check++;
                }
            }
        }
        else{
            return false;
        }
        return 0 == check;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First String: ");
        String str1 = input.nextLine();
        System.out.print("Enter the Second String: ");
        String str2 = input.nextLine();
        boolean result = anagrams.check(str1,str2);
        if(result)
        {
            System.out.println("The Given Strings are Anagram");
        }
        else{
            System.out.println("The Given Strings are not Anagram");
        }
    }
}
