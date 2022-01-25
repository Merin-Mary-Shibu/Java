import java.util.*;
class OddEven
{
    public static void main(String args[])
    {
        int n; 
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        n=obj.nextInt();
        if(n%2==0)
        {
            System.out.println("It is an even number");
        }
        else
        {
            System.out.println("It is an odd number");   
        }
    }
}
