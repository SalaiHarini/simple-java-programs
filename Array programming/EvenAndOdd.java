import java.util.*;

public class EvenAndOdd {
    public static void main(String[] args) {
	    int i,j,n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int number = input.nextInt();
	    int[] completeArray= new int[number];
		System.out.println("Enter the elements: ");
		for(i=0;i<=number;i++){
		completeArray[i]=input.nextInt();
		}
		int k=0; int l=0;
		int counter=0;
		for(j=0;j<=number;j++){
		if(completeArray[j]%2!=0){
		counter++;}
		}
		l=counter-1;
		for(n=0;n<=number;n++){
		if(completeArray[n]%2!=0){
		completeArray[n]=completeArray[k];
		k++;
		}
		else{
		completeArray[n]=completeArray[l];
		l++;}
		}
		System.out.println(completeArray);
		
	}
}
		
        