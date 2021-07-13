package almamatter;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr=new Scanner(System.in);
		System.out.println("enter nuber below 10");
		int n=sr.nextInt();
		int sum=0;
		while(n<= 10)
		{
		  sum=sum+n;
		  n++;
	    }
      System.out.format("the sum is  %d ",sum);
      
}
	}