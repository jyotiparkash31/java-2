
package sendaC;
public class sunnyjp 
{
		public static void main(String[] args) 
		{
	        int i=1;
	        int j=2;
	        int count=0;
	          for(i=1;i<=25;i++)
	          {
		       count=0;
		       for(j=2;j<=i/2;j++) 
		       {
			       if(i%j==0)
			       {	count=count+1;
			            break;
			       }		
		       }
		       if(count==0 && i!=1)
	        	{
			      System.out.printf("%d\t",i);
		        }
	         }
	     }
		
	}
	
	


