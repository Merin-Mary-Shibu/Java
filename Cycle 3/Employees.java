import java.util.*;
public class Employees
{
  String n;
  int e, p;
  void Enter()
  {
    Scanner obj = new Scanner (System.in);
      System.out.print ("Enter Name :");
      n = obj.nextLine ();

      System.out.print ("Enter Employee Number :");
      e = obj.nextInt ();

      System.out.print ("Enter Phone Number :");
      p = obj.nextInt ();
  }

  void Print ()
  {
    
    System.out.println ("Name : " + n);

    System.out.println ("Employee Number : " + e);

    System.out.println ("Phone Number : " + p);
  }

  public static void main (String[]args)
  {
    int i;
    Employees obj[] = new Employees[50];

        for(i=0;i<5;i++) 
          {  
            System.out.println (""+(i+1)+")");
            obj[i] = new Employees();
            obj[i].Enter(); 
          }
        System.out.println ("\nDetails of Employees:"); 
        for(i=0;i<5;i++) 
          {
            System.out.println (""+(i+1)+")");
            obj[i].Print();
            System.out.println ("\n");
          }
  }
}
