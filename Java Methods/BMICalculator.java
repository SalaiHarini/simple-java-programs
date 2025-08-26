import java.util.Scanner;

public class BMICalculator {

    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] people = new double[10][3];
        String[] statuses = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            double weight = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            double height = sc.nextDouble();

            double bmi = calculateBMI(weight, height);
            people[i][0] = weight;
            people[i][1] = height;
            people[i][2] = bmi;
            statuses[i] = getBMIStatus(bmi);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ": Weight = " + people[i][0] +
                    " kg, Height = " + people[i][1] + " cm, BMI = " + String.format("%.2f", people[i][2]) +
                    ", Status = " + statuses[i]);
        }
    }
}
