package sendaC;

public class testree
{
	static int checkPrime(int num)
	{ int i,flag=0;
	  for(i=2;i<=num/2;i++)
	  {
		  if(num%i==0)
		  { flag=1;
		    break;
		  }  
	  }
	  if(flag==0)
		  return 1;
	  else
		  return 0;
	  
	}
	static void printAlternatePrimeNo(int n)
	{
		int temp=0;
		for(int i=2;i<=n;i++)
		{
			if(checkPrime(i)==1)
			{
				temp=temp+1;
			    if(temp%2==0)
				  System.out.println(i+"");
			}
		}
		}
		
	public static void main(String...args)
	{
	  	int result=checkPrime(4);
	  	System.out.println(result+"\n");
	  	printAlternatePrimeNo(29);
		
	}
}
