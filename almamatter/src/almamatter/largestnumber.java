package almamatter;

import java.util.Scanner;

public class largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sr = new Scanner(System.in);
      System.out.println("enter the three numbers");
      int a=sr.nextInt();
      int b=sr.nextInt();
      int c=sr.nextInt();
      if (a>b && a>c)
    	  System.out.println(a+ "  is the largest number");
      else if(b>c && b>a)
    	  System.out.println(b +" is the largest number");
      else
    	  System.out.println(c +"is the largest number");
      
      
	}

}
