package sendaC;
import java.util.*;

public class practice {
	

	public static void main(String[] 	 args)
	{  
		sum(10,30,49,38,49,89,3,796);
		armstrong(143);
		duplicatestr();
	}
	public static void sum(int...y) 
	{
       int sum=0;
		
		for(int x1:y)
		{
			sum=sum+x1;
		}
		System.out.println(sum);
		
		
	 
	}
	public static void pFactor()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=in.nextInt();
		int temp=n;
		int sum=0;
		for( int i=1;i<n;i++)
		{
			 if (n%i==0)
			 { 
			   sum=sum+i;
			 }
			  
		}
		if(temp==sum)
		{
			System.out.println("the number " + temp + " is perfect number");
		}
		else
			System.out.println("the number  " + temp + " is not perfect number");
		
		
		in.close();
	}
	public static void sumof()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=in.nextInt();
		float sum=0;
		for(float j=1;j<=n;j++)
		{
			sum=sum+(1/j);
		}
		System.out.println(sum);
		
		
		in.close();
	}
	public static void armstrong(int n)
	{
		int sum=0,d=0;
		int temp=n;
		while(n!=0)
		{
		  d=n%10;
		  sum=sum+(d*d*d);
		  n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("the number is a Armstrong ");
		}
		else
		{
			System.out.println("The number is not Armstrong");
		}
	}
	 public static void duplicatestr() 
	 {
	        String str = "w3resource";
	        System.out.println("The given string is: " + str);
	        String result = "";

	        for (int i = 0; i < str.length(); i++)
	        {   
	            String temp = ""+str.charAt(i);
	            if ( !(result.contains(temp)) )
	                result += temp;
	        }

	        System.out.println("After removing duplicates characters the new string is: " + result);
	    }
	
}
