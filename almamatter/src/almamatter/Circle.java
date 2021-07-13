package almamatter;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		       Scanner c =new Scanner(System.in);
		       System.out.println("enter the radius of a circle");
		       double r= c.nextDouble();
		       double area = Math.PI * r*r;
		       System.out.println("the area of a circle is   "+ area);
		       
	}

}
