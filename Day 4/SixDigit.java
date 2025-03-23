public class SixDigit
{
    public static int[] otp()
    {
        int[] otp = new int[10];
        for(int i=0; i<10; i++)
        {
            otp[i] =(int)(Math.random()*1000000);
        }
        return otp;
    }
    public static boolean check(int[] otp)
    {
        for (int i=0; i<10; i++)
        {
            for(int j=i+1; j<10; j++)
            {
                if(otp[i]==otp[j])
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] otp = SixDigit.otp();
        boolean unique = SixDigit.check(otp);
        System.out.println("Randomly generated otp are: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(otp[i] + ", ");
        }
        if (unique) {
            System.out.println("\nEach otp is unique");
        }
        else {
            System.out.println("Not a unique otp");
        }
    }
}
