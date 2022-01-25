import java.util.*;
class Replace
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n,i,m,b;
        int a[]=new int[50];
        System.out.println("Enter the number of elements");
        n=obj.nextInt();
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("Enter the the number to be replaced");
        m=obj.nextInt();
        System.out.println("Enter the number to be placed");
        b=obj.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==m)
                a[i]=b;
        }
        System.out.println("The new array is");
        for(i=0;i<n;i++)
        System.out.println(a[i]);
     }
}
