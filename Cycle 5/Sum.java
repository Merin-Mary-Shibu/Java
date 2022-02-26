import java.io.*;
import java.util.*;
class Sum
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            FileInputStream fin = new FileInputStream("t4.txt");
            int ch,sum=0,b;
            String a;
            String s;
            System.out.println("The Numbers in the file are : ");
            while( (ch = fin.read())!=-1 )  
            {
                s=Character.toString((char)ch);
                StringTokenizer st = new StringTokenizer(s);
                while( st.hasMoreTokens()) 
                {
                    a = st.nextToken();
                    b = Integer.parseInt(a);
                    System.out.println(b);
                    sum = sum + b; 
                }
            }
        System.out.println("The sum is " + sum);
        }
        catch(Exception e) 
        {
          System.out.print(e);
        }
	}

}
