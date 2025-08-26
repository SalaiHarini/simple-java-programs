import java.util.*;
public class MultiplicationTable2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int[] multiplied= new int[10];
		int inputNumber,i;
		System.out.println("Enter the number: ");
		inputNumber=input.nextInt();
		if(inputNumber>=6 && inputNumber<=8)
		{
		  for(i=0;i<10;i++)
		  {
		    multiplied[i]=inputNumber*(i+1);
		    System.out.println(inputNumber+" * "+(i+1)+" is "+multiplied[i]);
		  }
		}
		else{
		System.out.println("Invalid input");}
		
	}
}
		