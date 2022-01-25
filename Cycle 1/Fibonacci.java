import java.util.*;
class Fibonacci
{
    public static void main(String args[])
    {
        int n,i,a=0,b=1,c;
        System.out.println("Enter the number");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        System.out.println("The Fibonacci Series is:");
        for(i=0;i<n;i++)
        {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
