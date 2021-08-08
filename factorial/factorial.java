
import java.util.*;
class factorial
{
	public static void main(String arg[])
	
	{
	
            long n,fact=1;
	
	    Scanner sc=new Scanner(System.in);
 
	    System.out.println("Enter Number");
	   
            n=sc.nextLong();
            int i=1;
	    while(i<=n)
	    {
	
	    fact=fact*i;
                     i++;
 	    }
 
  	    System.out.println("Factorial of this number is = "+fact);
 
	}
 
}