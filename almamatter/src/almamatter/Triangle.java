package almamatter;

import java.util.Scanner;	

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			   Scanner tr=new Scanner(System.in);
		       System.out.println("enter the base and height of a triangle");
		       double base = tr.nextDouble();
		       double ht = tr.nextDouble();
		       double area = (base*ht)/2;
		       System.out.println("the area of a triangle is   "+ area);
		       
	}

}
