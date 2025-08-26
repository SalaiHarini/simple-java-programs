package javpackage;

//Abstract class
abstract class RBI {
 // Abstract method (no body)
 abstract void int_rate_calc(){
    System.out.println("The interest rate is 11% ");
 };

 // Concrete method
 public void int_r(float principal) {
    int interest=(11/100)*principal;
     System.out.println("The interest rate is: "+interest);
 }
}

//Subclass
class SBI extends RBI {
 // Implementing abstract method
	//@Override
	public void print_int_rate(float amount) {
        int interest2=(9/100)*amount;
     System.out.println("The interest rate for SBI is:"+interest2);
 }
}
class final_ extends RBI
{
	public void warning()
	{
		System.out.println(" The given interest rate is fixed.");
	}
}

//Main class
public class int_rate {
 public static void main(String[] args) {
     RBI myRBI = new SBI();  
     myRBI.print_int_rate(20000.0);             
     myRBI.int_r();               
     
     RBI myfinal = new final_();
     myfinal.int_r();
     myfinal.final_();
     
 }
}
