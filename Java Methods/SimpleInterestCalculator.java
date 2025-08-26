import java.util.*;
public class SimpleInterestCalculator{
    void simpleInterest()
    {
        double principal, rate, time, simpleInterest;
        Scanner input= new Scanner(System.in); // Scanner object
        System.out.println("Enter the principal, rate of interest and the time period: ");
        principal=input.nextDouble();
        rate=input.nextDouble();
        time=input.nextDouble();
        simpleInterest=(principal*rate*time)/100;
        System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
    }
	public static void main(String []args)
	{
	  SimpleInterestCalculator calculator=new SimpleInterestCalculator();
	  calculator.simpleInterest();
	 }
}
