import java.util.*;
public class MeanOfHeight{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		double[] height= new double[11];
		int i,sum=0,meanOfPlayers;
		System.out.println("Enter heights of all 11 members: ");
		for(i=0;i<11;i++)
		{ 
	      height[i]=input.nextDouble();
		  sum+=height[i];
		}
		meanOfPlayers=sum/11;
		System.out.println("The mean of the heights of the players is:"+meanOfPlayers);
	}
}