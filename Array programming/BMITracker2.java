import java.util.*;

public class BMITracker2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int numPersons = input.nextInt();
        double[][] personData = new double[numPersons][3];
        String[] weightStatus = new String[numPersons];
        
        for (int i = 0; i < numPersons; i++) {
            double height, weight;
            do {
                System.out.print("Enter height (m) for person " + (i + 1) + ": ");
                height = input.nextDouble();
            } while (height <= 0);
            
            do {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                weight = input.nextDouble();
            } while (weight <= 0);
            
            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = weight / (height * height);
            
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        
        System.out.println("Height (m) \t Weight (kg) \t BMI \t Status");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%.2f \t %.2f \t %.2f \t %s\n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}
