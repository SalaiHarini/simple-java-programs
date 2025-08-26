import java.util.*;

public class DigitArrayLargest2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number < 0) {
            number *= -1;
        }
        int maxDigit = 10;
        int[] digitsArray = new int[maxDigit];
        int index = 0;
        while (number != 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] tempArray = new int[maxDigit];
                System.arraycopy(digitsArray, 0, tempArray, 0, index);
                digitsArray = tempArray;
            }
            digitsArray[index++] = number % 10;
            number /= 10;
        }
        if (index == 0) {
            System.out.println("No digits found.");
            return;
        }
        int largest = digitsArray[0], secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < index; i++) {
            if (digitsArray[i] > largest) {
                secondLargest = largest;
                largest = digitsArray[i];
            } else if (digitsArray[i] > secondLargest && digitsArray[i] != largest) {
                secondLargest = digitsArray[i];
            }
        }
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + (secondLargest == Integer.MIN_VALUE ? "None" : secondLargest));
    }
}