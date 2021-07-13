package almamatter;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		Scanner sr= new Scanner(System.in);
		System.out.println("enter the number  ");
	     num =sr.nextInt();
		int reverse= 0;
		while(num!=0)
		{
			reverse = reverse *10;
			reverse = reverse+ num % 10 ;
			num = num/10;
		}
       System.out.println( "the reverse of the given is  : "+ reverse);
	}

}
