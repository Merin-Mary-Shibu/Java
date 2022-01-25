import java.util.*;
class SumOfNaturalNumbers
{
    public static void main(String args[])
    {
        int n,i,sum=0;
        System.out.println("Enter the number");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum = "+sum);
    }
}
