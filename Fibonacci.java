/**
 * @author PRATHAMESH TIBILE
 * Simulate Fibonacci Program
 */


package Day6_logical;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String args[])  
	{  
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number:");
		int count=s.nextInt();
	 int n1=0,n2=1,n3,i;    
	//printing 0 and 1  
	 System.out.print(n1+" "+n2);  
	    
	 for(i=2;i<count;++i)    
	 {    
	  n3=n1+n2;    
	  System.out.print(" "+n3);    
	  n1=n2;    
	  n2=n3;    
	 }    
	  
	}
}


