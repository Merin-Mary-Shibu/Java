import java.util.*;
class Factorial
{
    public static void main(String args[])
    {
        int n,i,f=1;
        System.out.println("Enter the number");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("The factorial is "+f);
    }
}
