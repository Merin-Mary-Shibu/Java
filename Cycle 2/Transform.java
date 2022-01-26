import java.util.*;
class Transform
{
	public static void main(String args[])
	{
		int i,j,n;
		int a[][]=new int[50][50];
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns:");
		n=obj.nextInt();
		System.out.println("Enter the matrix elements:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=obj.nextInt();
			}
		}
		System.out.println("The transpose is:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.printf("%d ",+a[j][i]);
			}
			System.out.println("\n");
		}
	}
}
