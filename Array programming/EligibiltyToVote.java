import java.util.*;
public class EligibiltyToVote{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int[] StudentAge= new int[10];
		int i,j,l;
		System.out.println("Enter the age of the students:");
		for(i=0;i<10;i++){
        StudentAge[i] = input.nextInt();
		}
		l=StudentAge.length;
		for(j=1;j<=l-1;j++)
		{
			if(StudentAge[j]<0)
			{ System.out.println("Invalid age");
		      System.exit(0);
			}
			else if(StudentAge[j]>=18)
		    {  System.out.println("Student with age "+StudentAge[j]+" can vote");
		    }
			else if(StudentAge[j]<18)
			{	System.out.println("Student with age "+StudentAge[j]+" cannot vote");
			}
		}
	}
}
		
		
