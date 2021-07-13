package almamatter;

import java.util.Scanner;

public class square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sq=new Scanner(System.in);
       System.out.println("enter the side to calculate area");
       double side= sq.nextDouble();
       double area = side * side;
       System.out.println("the area of a square is   "+ area);
       
	}

}
