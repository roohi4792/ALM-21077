package almamatter;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int i=0,j=0;
      String p =  "" ;
      for(i=1;i<=100;i++)
      {  
    	  int counter=0;
    	  for(j=i;j>=1;j--)
    	  {
    		  if(i%j==0)
    		  {
    	        counter= counter + 1;
    		  }
    	  }
    	  if(counter ==2)
    		  {
    			  p = p + i + "";
    		  }	  
    	  }
     System.out.println("the prime numbers from 1 to 100 is   ");
   System.out.println( p +"\t"); 
}
}