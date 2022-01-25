import java.util.*;
class Sum
{
    public static void main(String args[])
    {
        int a,b,sum;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the two numbers to be added");
        a=obj.nextInt();
        b=obj.nextInt();
        sum=a+b;
        System.out.println("Result = "+sum);
    }
}
