import java.util.Scanner;
public class DigitNumber
{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        int buffer = num;
        int count = 0;
        int largest = 0;
        int second_largest = 0;
        while (buffer != 0) {
            buffer = buffer / 10;
            count++;
        }
        int[] digit = new int[count];
        for (int i = 0; i < count; i++) {
            digit[i] = num % 10;
            num = num / 10;
        }
        for (int j = 0; j < count; j++) {
            if (digit[j] > largest)
            {
                second_largest = largest;
                largest = digit[j];
            }
            else if (digit[j]>second_largest && digit[j]!=largest)
            {
                second_largest = digit[j];
            }
        }
        System.out.println("Largest Number: " + largest + " and Second Largest: " + second_largest);
    }
}
