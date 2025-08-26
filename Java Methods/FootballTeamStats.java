import java.util.Random;

public class FootballTeamStats {

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int height : arr) sum += height;
        return sum;
    }

    public static double getMean(int[] arr) {
        return getSum(arr) / (double) arr.length;
    }

    public static int getShortest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int height : arr) if (height < min) min = height;
        return min;
    }

    public static int getTallest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int height : arr) if (height > max) max = height;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; // 150 to 250
        }

        System.out.print("Heights: ");
        for (int h : heights) System.out.print(h + " ");
        System.out.println("\nShortest Height: " + getShortest(heights));
        System.out.println("Tallest Height: " + getTallest(heights));
        System.out.println("Mean Height: " + getMean(heights));
    }
}
