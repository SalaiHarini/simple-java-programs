import java.util.*;
public class ArraySum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		double[] arr= new double[10];
		int i=0, sum=0, inputNumber;
		while(true)
		{ 
		  System.out.println("Enter the value: ");
		  inputNumber=input.nextInt();
		  if(inputNumber<=0)
		  break;
		  else
		  arr[i]=inputNumber;
		  i++;
		}
		for(i=0;i<10;i++)
		{ sum+=arr[i];}
		System.out.println("The total sum is:"+sum);
	}
}
		  