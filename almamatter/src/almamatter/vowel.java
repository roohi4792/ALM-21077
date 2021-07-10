package almamatter;

import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner qr= new Scanner(System.in);
	      System.out.println("enter a character = ");
	      char c = qr.next().charAt(0);
	     
	      if( c =='a' || c=='e'|| c=='i' || c=='o' ||c=='u')
	    	  System.out.println("its a vowel");
	      else
	    	  System.out.println("its a consonant");
	      

	}

}
