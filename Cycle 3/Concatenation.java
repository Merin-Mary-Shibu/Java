import java.util.*;
class Concatenation
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter 2 strings to be concatenated :\n");
        String c = obj.nextLine();
        String d = obj.nextLine();
        
        System.out.print("Enter 2 numbers to be concatenated :\n");
        int a = obj.nextInt();
        int b = obj.nextInt();
        
       
        Concat obj1 = new Concat();
        obj1.Concatenate(a,b);
        obj1.Concatenate(c,d);
    }
}

class Concat
{
    void Concatenate(int a,int b)
       { 
          System.out.println("Concatenated numbers = " +a+b);
       }
    
    void Concatenate(String a,String b)  
       {
 System.out.print("Concatenated strings = "+a+b);
       }
}
