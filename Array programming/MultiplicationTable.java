import java.util.*;
public class MultiplicationTable{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int[] multiplied= new int[10];
		int inputNumber,i;
		System.out.println("Enter the number: ");
		inputNumber=input.nextInt();
		for(i=0;i<10;i++)
		{
		  multiplied[i]=inputNumber*(i+1);
		  System.out.println(inputNumber+" * "+(i+1)+" is "+multiplied[i]);
		}
	}
}
		