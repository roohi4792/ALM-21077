package almamatter;

public class NestedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		int term=2,course=2;
		switch(term)
		{
		case 1:
			System.out.println("python");
			break;
		case 2:
			switch(course)
			{
			case 1:
				System.out.println("J2EE");
				break;
			case 2:
				System.out.println("java");
			}
		}
		

	}

}
