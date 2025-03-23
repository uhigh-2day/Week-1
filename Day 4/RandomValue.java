import java.util.Scanner;

public class RandomValue
{
    public static int[] generate4DigitRandomArray(int size)
    {
        int[] array = new int[size];
        for(int i=0; i<size; i++)
        {
            double tem = Math.random();
            double temp = tem*10000;
            array[i] = (int)temp;
        }
        return array;
    }
    public static double[] findAverageMinMax(int[] numbers)
    {
        int lenght = numbers.length;
        double[] result = new double[3];
        result[1]=10000;
        result[0]=0;
        for (int number : numbers) {
            result[0] += number;
            result[1] = Math.min(result[1], number);
            result[2] = Math.max(result[2], number);
        }
        result[0] = result[0]/lenght;
        return result;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = input.nextInt();
        int[] array = RandomValue.generate4DigitRandomArray(size);
        double[] result = RandomValue.findAverageMinMax(array);
        System.out.println("Random Generated Numbers are: ");
        for(int i=0; i<size; i++)
        {
            System.out.println(array[i]+", ");
        }
        System.out.println("Average of Random Numbers are: "+result[0]);
        System.out.println("Minimum of Random Numbers are: "+result[1]);
        System.out.println("Maximum of Random Numbers are: "+result[2]);
    }
}
