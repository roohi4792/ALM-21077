package almamatter;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		boolean isPrime=true;
      Scanner sr= new Scanner(System.in);
      System.out.println("enter the number you want to know");
      int n = sr.nextInt();
      sr.close();
      for(int i=2 ;i<=n/2;i++)
      {
    	  t=n%i;
    	  if(t==0)
    	  {
    		  isPrime=false;
    		  break;
    	  }
      }
      if(isPrime)
    	  System.out.println("It is a Prime number");
      else
    	   System.out.println("It is not a Prime number");
	}
	}
