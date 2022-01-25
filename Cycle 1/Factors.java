import java.util.*;
class Factors
{
    public static void main(String args[])
    {
        int n,i;
        System.out.println("Enter the number");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        System.out.println("The factors are:");
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
                System.out.println(i);
        }
    }
}
