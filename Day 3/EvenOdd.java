import java.util.Scanner;
public class EvenOdd {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int num = input.nextInt();
        int size = (num / 2) + 1;
        int evencount = 0;
        int oddcount = 0;
        int[] even = new int[size];
        int[] odd = new int[size];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter the Number: ");
            int x = input.nextInt();
            if (x % 2 == 0) {
                even[evencount] = x;
                evencount++;
            } else {
                odd[oddcount] = x;
                oddcount++;
            }
        }
        System.out.print("Odd Numbers are: ");
        for (int j = 0; j < oddcount; j++) {
            System.out.print(odd[j] +" ");
        }
        System.out.print("Even Numbers are: ");
        for (int k = 0; k < evencount; k++) {
            System.out.print(even[k]+ " ");
        }
    }
}
