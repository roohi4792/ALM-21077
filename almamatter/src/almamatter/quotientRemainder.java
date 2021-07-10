package almamatter;

import java.util.Scanner;

public class quotientRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner qr= new Scanner(System.in);
      System.out.println("enter the numbers ");
      int a=qr.nextInt();
      int b=qr.nextInt();
      int q=a/b;
      int r=a%b;
    	  System.out.println("the quotient is"+ q);
    	  System.out.println("the remainder is"+r);
      
      
	} 

}
