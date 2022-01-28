import java.util.*;
class Transpose
{
	public static void main(String args[])
	{
		int i,j,r,c;
		int a[][]=new int[50][50];
		int b[][]=new int[50][50];
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		r=obj.nextInt();
		System.out.println("Enter the number of columns:");
		c=obj.nextInt();
		System.out.println("Enter the matrix elements:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=obj.nextInt();
			}
		}
		for(i=0;i<r;i++)
		{
            for(j=0;j<c;j++)
            {
              b[j][i] = a[i][j];
            }
		}
		System.out.println("The transpose is:");
		for(i=0;i<c;i++)
		{
			for(j=0;j<r;j++)
			{
				System.out.printf("%d ",+a[j][i]);
			}
			System.out.println("\n");
		}
	}
}
