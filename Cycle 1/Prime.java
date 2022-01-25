import java.util.*;
class Prime
{
    public static void main(String args[])
    {
        int n,i,flag=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
        n = obj.nextInt();
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(n==1)
        {
            System.out.println("It is not a prime number");
        }
        else
        {
        if(flag==0)
            System.out.println("It is a prime number");
        else
            System.out.println("It is not a prime number");   
        }
    }
}
