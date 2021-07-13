package almamatter;

public class reversepyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=10;
		for(int i=1;i<=t;i++)
		{
			for(int j=t;j>=i;j--)
			{ 
				System.out.print("*");
			}
		
			System.out.println();
		}
		
	}

}
