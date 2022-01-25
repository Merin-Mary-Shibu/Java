import java.util.*;
class Armstrong
{
    public static void main(String args[])
    {
        int a,n,r,s=0;
        System.out.println("Enter a three digit number");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        a=n;
        while(n>0)
        {
            r=n%10;
            s=s+r*r*r;
            n=n/10;
        }
        if (s==a)
            System.out.println("This is an amstrong number");
        else
            System.out.println("This is not an amstrong number");   
    }
}
