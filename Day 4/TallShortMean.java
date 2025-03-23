import java.util.Random;

public class TallShortMean
{
    public static int sum(int[] h)
    {
        int sum = 0;
        for (int i=0; i<11; i++)
        {
            sum += h[i];
        }
        return sum;
    }
    public static double mean(int[] h)
    {
        int sum = TallShortMean.sum(h);
        double mean = sum/11;
        return mean;
    }
    public static int shortest(int[] h)
    {
        int shortest = 251;
        for(int i=0; i<11; i++)
        {
            shortest = Math.min(h[i], shortest);
        }
        return  shortest;
    }
    public static int tallest(int[] h)
    {
        int tallest = 149;
        for(int i=0; i<11; i++)
        {
            tallest = Math.max(h[i], tallest);
        }
        return  tallest;
    }
    public static void main(String[] args)
    {
        Random random = new Random();
        int[] heights = new int[11];
        for (int i=0; i<11; i++)
        {
            heights[i] = random.nextInt(101) + 150;
        }

        for (int i=0; i<11; i++)
        {
            System.out.println("Height of "+(i+1)+"st Player is: "+heights[i]);
        }
        double mean = TallShortMean.mean(heights);
        int shortest = TallShortMean.shortest(heights);
        int tallest = TallShortMean.tallest(heights);
        System.out.println("Mean height of all the players are: "+mean);
        System.out.println("Shortest height of all the players are: "+shortest);
        System.out.println("Tallest height of all the players are: "+tallest);

    }
}
