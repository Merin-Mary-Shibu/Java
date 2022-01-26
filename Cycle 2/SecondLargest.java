import java.util.*;
class SecondLargest
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int n,i,l=0,sl=0;
        System.out.println("Enter the number of elements in the array");
        n=obj.nextInt();
        int a[]=new int[100];
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        for(i=0;i<n;i++)
            if(a[i]>l)
            {
                l=a[i];
            };
        for(i=0;i<n;i++)
        {
            if(a[i]>sl && a[i]<l)
                sl=a[i];
        }
        System.out.println("The second largest element is "+sl);
     }
}
