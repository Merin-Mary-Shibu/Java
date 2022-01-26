import java.util.*;
class Main
{
	public static void main(String args[])
	{
	  int a[][]=new int[50][50];
		int n,i,j,sum=0;
		System.out.println("Enter number of rows and columns in the nxn matrix:");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
    System.out.println("Enter the elements in the matrix:");
    for(i=0;i<n;i++)
    {
    	  for(j=0;j<n;j++)
    	  {
              a[i][j]=obj.nextInt();
    	        if(i==j)
    	            sum=sum+a[i][j];
    	  }
    	    
    }
		System.out.println("Trace = "+sum);
	}
}
