import java.util.*;
class Addition
{
	public static void main(String args[])
	{
	  int a[][]=new int[50][50];
		int b[][]=new int[50][50];
		int s[][]=new int[50][50];
		int n,i,j,r,c;
		System.out.println("Enter number of rows and columns in the matrix:");
		Scanner obj=new Scanner(System.in);
		r=obj.nextInt();
		c=obj.nextInt();
		System.out.println("Enter the elements for the first matrix:");
		for(i=0;i<r;i++)
	    {
	        for(j=0;j<c;j++)
	        {
	            a[i][j]=obj.nextInt();
	        }
	    }
		System.out.println("Enter the elements for the first matrix:");
		for(i=0;i<r;i++)
	    {
	        for(j=0;j<c;j++)
	        {
	            b[i][j]=obj.nextInt();
	        }
	    }	
	    System.out.println("Result:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				s[i][j]=a[i][j]+b[i][j];
				System.out.printf("%d ",s[i][j]);
				
			}
			System.out.println("\n");
		}
	}
}
