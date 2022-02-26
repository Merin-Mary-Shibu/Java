import java.io.*;
class Read
{
    public static void main(String args[]) throws Exception
    {
        int i=0,j=1;
        try
        {
           FileInputStream f = new FileInputStream("t1.txt"); 
           System.out.print(j +"-");
           while((i=f.read())!=-1)
           {
             System.out.print((char)i);
             if(i=='\n')
               System.out.print(++j +"-");
           }
         }  
        catch(Exception e)
        {
            System.out.println(e); 
        }
        f.close();
    }
}
