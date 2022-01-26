import java.util.*;
class Largest
{
    public static void main(String args[])
    {
        int a[][]=new int[50][50];
        int n,i,j,l;
        System.out.println("Enter the number of rows and columns in an nxn matrix:");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        System.out.println("Enter the matrix elements:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=obj.nextInt();
            }
        }
        l=a[0][0];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(a[i][j]>l)
                    l=a[i][j];
            }
        }
        System.out.println("The largest element is: "+l);
    }
}
