import java.io.*;
class FileNotFound
{
   public static void main(String[] args)
   {
      try
      {
        FileInputStream f=new FileInputStream("fin.txt");
      }
      catch(FileNotFoundException e)
      {
        System.out.println(e);
      }
   }
}
