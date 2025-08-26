import java.util.Random;

public class ZaraBonusCalculator {

    public static int[][] generateSalariesAndService(int n) {
        int[][] data = new int[n][2];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); // Salary: 5-digit
            data[i][1] = 1 + rand.nextInt(10);        // Service years: 1 to 10
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(int[][] data) {
        double[][] result = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            double bonusRate = data[i][1] > 5 ? 0.05 : 0.02;
            double bonus = data[i][0] * bonusRate;
            result[i][0] = bonus;
            result[i][1] = data[i][0] + bonus;
        }
        return result;
    }

    public static void displaySummary(int[][] original, double[][] updated) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.printf("%-5s %-10s %-10s %-10s %-10s\n", "Emp#", "OldSal", "Service", "Bonus", "NewSal");
        for (int i = 0; i < original.length; i++) {
            totalOld += original[i][0];
            totalBonus += updated[i][0];
            totalNew += updated[i][1];
            System.out.printf("%-5d %-10d %-10d %-10.2f %-10.2f\n", 
                i + 1, original[i][0], original[i][1], updated[i][0], updated[i][1]);
        }

        System.out.println("---------------------------------------------------------");
        System.out.printf("Total Old Salary: %.2f\n", totalOld);
        System.out.printf("Total Bonus Paid: %.2f\n", totalBonus);
        System.out.printf("Total New Salary: %.2f\n", totalNew);
    }

    public static void main(String[] args) {
        int[][] salaryData = generateSalariesAndService(10);
        double[][] updatedData = calculateBonusAndNewSalary(salaryData);
        displaySummary(salaryData, updatedData);
    }
}
