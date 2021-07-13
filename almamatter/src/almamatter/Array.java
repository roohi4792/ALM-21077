package almamatter;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {10,20,30,70,80,90};
		int sum=0;
		for (int num : array)
		{
			sum =sum +num;
		}
        System.out.println("the sum of elements of array is  :  "+sum);
	}

}
