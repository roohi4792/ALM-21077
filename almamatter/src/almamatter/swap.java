package almamatter;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter two numbers");
		int a= s.nextInt();
		int b= s.nextInt();
		System.out.println("you entered the numbers"+a +"and"+  b);
		int t=a;
		a=b;
		b=t;
		System.out.println("now the numbers  are "+a +"and"+  b);
		

	}

}
