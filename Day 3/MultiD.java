import java.util.Scanner;
public class MultiD {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of n: ");
        int n = input.nextInt();
        System.out.print("Enter the size of m: ");
        int m = input.nextInt();
        int index = 0;
        int printindex = 0;
        int[][] Array_2D = new int[n][m];
        int[] Array_1D = new int[n * m];
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < m; l++)
            {
                System.out.print("Enter the "+(k)+" and "+(l)+" element: " );
                Array_2D[k][l] = input.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Array_1D[index] = Array_2D[i][j];
                index++;
            }
        }
        System.out.print("Converting 2D Array to 1D Array: ");
        for (int p = 0; p < n; p++) {
            for (int q = 0; q < m; q++) {
                System.out.print(Array_1D[printindex] + " ");
                printindex++;
            }
        }
    }
}
