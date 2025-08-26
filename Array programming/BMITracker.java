import java.util.*;

public class BMITracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int numPersons = input.nextInt();
        double[] heights = new double[numPersons];
        double[] weights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] statuses = new String[numPersons];
        
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter height (m) for person " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weights[i] = input.nextDouble();
            bmis[i] = weights[i] / (heights[i] * heights[i]);
            
            if (bmis[i] < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmis[i] < 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmis[i] < 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        
        System.out.println("Height (m) \t Weight (kg) \t BMI \t Status");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%.2f \t %.2f \t %.2f \t %s\n", heights[i], weights[i], bmis[i], statuses[i]);
        }
    }
}