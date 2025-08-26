import java.util.HashSet;
import java.util.Random;

public class OtpGenerator {

    public static int generateOtp() {
        return 100000 + (int)(Math.random() * 900000);
    }

    public static boolean areOtpsUnique(int[] otps) {
        HashSet<Integer> set = new HashSet<>();
        for (int otp : otps) {
            set.add(otp);
        }
        return set.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOtp();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }
        boolean unique = areOtpsUnique(otps);
        System.out.println("Are all OTPs unique? " + (unique ? "Yes" : "No"));
    }
}
