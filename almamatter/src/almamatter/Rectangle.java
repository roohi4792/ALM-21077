package almamatter;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner rec= new Scanner(System.in);
       System.out.println("Enter the lenghth and breadth to find area  ");
       double l = rec.nextDouble();
       double b = rec.nextDouble();
       double area;
       area = l*b;
       System.out.println("the area of tha rectangle is :"+area);
       
	}

}
