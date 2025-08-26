package javpackage;

// Abstract class
abstract class RBI {
    // Abstract method (no body)
    abstract void print_int_rate(float amount);

    // Concrete method
    public void int_r(float principal) {
        float interest = (11f / 100f) * principal;
        System.out.println("The RBI interest is: " + interest);
    }
}

// Subclass SBI extending RBI
class SBI extends RBI {
    // Overriding abstract method
    @Override
    public void print_int_rate(float amount) {
        float interest2 = (9f / 100f) * amount;
        System.out.println("The interest rate for SBI is: " + interest2);
    }
}

// Another subclass
class final_ extends RBI {
    @Override
    public void print_int_rate(float amount) {
        System.out.println("Fixed rate. No interest calculated.");
    }

    public void warning() {
        System.out.println("The given interest rate is fixed.");
    }
}

// Main class
public class int_rate {
    public static void main(String[] args) {
        RBI myRBI = new SBI();  
        myRBI.print_int_rate(20000.0f); // Calls SBI's implementation
        myRBI.int_r(20000.0f);          // Calls RBI's concrete method

        final_ myfinal = new final_();  // Need to access subclass methods
        myfinal.print_int_rate(20000.0f);
        myfinal.int_r(20000.0f);
        myfinal.warning();
    }
}