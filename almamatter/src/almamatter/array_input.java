package almamatter;

import java.util.Scanner;

public class array_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr= new Scanner(System.in);
		int[] array =new int[10];
		int sum=0;
		System.out.println("enter the elements");
		for(int i=0;i<10;i++)
		{
			array[i]= sr.nextInt();
		}
        for (int num : array)
        {
        	sum =sum+num;
        }
		System.out.println("the sum of the array is" + sum);
	}

}
