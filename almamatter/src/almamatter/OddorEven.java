package almamatter;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner  sr=new Scanner(System.in);
       System.out.println("enter the number");
       int i=sr.nextInt();
       if(i%2==0)
    	   System.out.println("It is an even number");
       else
    	   System.out.println("It is an odd number");
	}

}
