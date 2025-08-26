import java.util.Scanner;
public class HandshakeCalculator {
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int maxHandshakes = calculateHandshakes(n);
        System.out.println(maxHandshakes);
    }
}
