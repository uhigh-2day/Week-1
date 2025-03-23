import java.util.Scanner;
class Factors
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        int maxIndex = 10;
        int fact = 0;
        int[] factors = new int[maxIndex];
        for(int i=1; i<num; i++)
        {
            if(num%i == 0)
            {
                factors[fact]=i;
                fact++;
            }
            if(fact==maxIndex)
            {
                maxIndex = 2*maxIndex;
                int[] newFactors = new int[maxIndex];
                System.arraycopy(factors,0,newFactors,0,fact);
                factors = newFactors;
            }
        }
        System.out.println("The factors are: ");
        for(int j=0; j<fact; j++)
        {
            System.out.println(factors[j] + " ");
        }
    }
}