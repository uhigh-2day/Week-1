import java.util.Scanner;
class MeanHeight
{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[11];
        double mean_height = 0;
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            System.out.print("Enter the Number: ");
            num[i] = input.nextInt();
        }
        for (int i = 0; i < 11; i++) {
            sum += num[i];
            mean_height = (double) sum / 11;
        }
        System.out.println("The Mean Heights of All the Players are: " + mean_height);
    }
}
