import java.util.*;

public class YoungestTallestFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age and height for " + names[i] + ":");
            
            while (true) {
                System.out.print("Age: ");
                ages[i] = input.nextInt();
                if (ages[i] > 0) break;
                System.out.println("Invalid age. Please enter a positive number.");
            }
            
            while (true) {
                System.out.print("Height (in cm): ");
                heights[i] = input.nextDouble();
                if (heights[i] > 0) break;
                System.out.println("Invalid height. Please enter a positive number.");
            }
        }
        
        int youngestIndex = 0, tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        
        System.out.println("\nYoungest friend: " + names[youngestIndex] + " (" + ages[youngestIndex] + " years)");
        System.out.println("Tallest friend: " + names[tallestIndex] + " (" + heights[tallestIndex] + " cm)");
    }
}
