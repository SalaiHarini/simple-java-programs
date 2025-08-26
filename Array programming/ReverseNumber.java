import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number < 0) {
            number *= -1;
        }
        int[] digitsArray = new int[10];
        int index = 0;
        while (number != 0) {
            if (index == digitsArray.length) {
                int[] tempArray = new int[digitsArray.length + 10];
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
        System.out.print("Reversed Number: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digitsArray[i]);
        }
        System.out.println();
    }
}