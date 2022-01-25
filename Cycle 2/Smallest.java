import java.util.*;
class Smallest
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int small,n,i;
        int[] a=new int[50];
        System.out.println("Enter the number of elements");
        n=obj.nextInt();
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        small=a[0];
        for(i=0;i<n;i++)
        {
            if(small>a[i])
                small=a[i];
        }
         System.out.println("The smallest element is "+small);
     }
}
