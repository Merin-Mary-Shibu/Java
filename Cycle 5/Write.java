import java.util.*;
import java.io.*;

public class Write 
{
  public static void main(String args[])  
  {
      try
      {
        FileWriter fw=new FileWriter("t3.txt");
        Scanner obj=new Scanner(System.in);
        String name;
        String address;
        System.out.print("Enter name: ");
        name=obj.nextLine();
        System.out.print("Enter address: ");
        address=obj.nextLine();
        fw.write(name);
        fw.write("\n");
        fw.write(address);
        fw.close();

        FileReader fr =new FileReader("t3.txt");
        int i;
        while((i=fr.read())!=-1)
        {
          System.out.print((char)i);
        }
       fr.close();
      }
      
      catch(Exception e)
      {
          System.out.println(e);
      }  
  }
}
