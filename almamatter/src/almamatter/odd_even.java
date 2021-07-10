package almamatter;

import java.util.Scanner;

public class odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr= new Scanner(System.in);
		System.out.println("enter the number");
		int a =sr.nextInt();
		if(a%2==0)
			System.out.println("its an even number");
		else 
			System.out.println("its an odd number");
		

	}

}
