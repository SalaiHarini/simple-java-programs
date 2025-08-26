import java.util.*;
public class PositiveOrNegative{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int[] compareNumbers= new int[5];
		int i;
		System.out.println("Enter the numbers: ");
		for(i=0;i<5;i++)
		{
		  compareNumbers[i]=input.nextInt();
		}
		for(i=0;i<5;i++)
		{
		 if(compareNumbers[i]<0)
		 { System.out.println(compareNumbers[i]+" is negative.");}
		 else if(compareNumbers[i]==0)
		 { System.out.println(compareNumbers[i]+" is zero");}
		 else if(compareNumbers[i]>0)
		 {
		   System.out.println(compareNumbers[i]+" is positive");
		   if(compareNumbers[i]%2==0)
		   {System.out.println(compareNumbers[i]+" is even");}
		   else if(compareNumbers[i]%2!=0)
		   {System.out.println(compareNumbers[i]+" is odd");}
		 }
		}
		if(compareNumbers[0]>compareNumbers[4])
		{ System.out.println(compareNumbers[0]+" is greater than "+compareNumbers[4]);}
		else if(compareNumbers[4]>compareNumbers[0])
		{System.out.println(compareNumbers[4]+" is greater than "+compareNumbers[0]);}
		else 
		{System.out.println(compareNumbers[4]+" and "+compareNumbers[0]+" are equal");}
	}
}