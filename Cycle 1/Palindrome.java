import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        int a,d,n,rev=0;
        System.out.println("Enter the number");
        Scanner obj = new Scanner(System.in);
        n=obj.nextInt();
        a=n;
        while(n>0)
        {
            d=n%10;
            rev=rev*10 + d;
            n=n/10;
        }
        if(rev==a)
            System.out.println("It is a palindrome");
        else
            System.out.println("It is not a palindrome");   
    }
}
