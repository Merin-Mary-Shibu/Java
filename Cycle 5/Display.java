import java.io.*;
public class Display
{
    public static void main(String args[]) throws Exception
    {
        int i=0,c=0,l=1,w=0;
        try
        {
            FileInputStream f = new FileInputStream("t2.txt");
            while ((i=f.read())!=-1)
            {
              c++;
              if(i=='\n')
                  l++;
              if(i== ' '|| i=='\n')
                  w++;
            }
            System.out.println("No of characters = "+c);
            System.out.println("No of lines = "+l);
            System.out.println("No of words = "+w);
            f.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
  }
