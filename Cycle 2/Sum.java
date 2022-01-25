import java.util.*;
class Sum
{
    public static void main (String args[])
    {
        int sum=0,n,i;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        n=obj.nextInt();
        int[]a=new int[50];
        System.out.println("Enter the array elements: ");
        for(i=0;i<n;i++)
        {
           a[i]=obj.nextInt(); 
           sum=sum+a[i];
        }
        System.out.println("Sum of the array elements = "+sum);
    }
}
