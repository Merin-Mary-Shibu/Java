import java.util.*;

class FactorialSum
{
	public static void main(String[] args)
	{ 
	  int m,n;
	  Scanner obj = new Scanner(System.in);
	  System.out.print("Enter the number whose factorial is to be calculated : ");
	  m = obj.nextInt();
	  System.out.print("Enter the number whose sum of digits is to be calculated :");
	  n = obj.nextInt();
	  
	  FactorialSum obj1= new FactorialSum();
	  obj1.Factorial(m);
	  obj1.SumofDigits(n);  
	 }
	 
	 void Factorial(int a)
	 {
	     int i,f=1;
	     for (i=1;i<=a;i++)
	        f = f * i;
	     System.out.println("Factorial = "+f);
	 }
	    
	 void SumofDigits(int a)   
	 {
	     int r=0,rem;
	     while(a!=0)
	     {
	         rem = a%10;
	         r = r + rem;
	         a = a/10;
	  
	     }
	     System.out.println("No of digits = "+r);
	 }
}
