class Odd extends Thread
{
  public void run()
  {
    try {
    System.out.println("Odd numbers between 1 and 100 are:"); 
    for(int i=1;i<=100;i++)
       if(i%2!=0)
         System.out.print(i+" ");
    }
    catch(Exception e)
    { 
      System.out.println(e);
    }
  }
}

class Even extends Thread
{
  public void run()
  {
    try {
    System.out.println("\nEven numbers between 1 and 100 are:");  
    for(int i=1;i<=100;i++)
       if(i%2==0)
          System.out.print(i+" ");
    }
    catch(Exception e)
    { 
      System.out.println(e);
    }
  }
}

class OddEven
{
     public static void main(String args[]) throws Exception
     {
        try
          {
             Odd o = new Odd();
             Even e = new Even();
             o.start();
             o.join();
             e.start();
          }
        catch(Exception e)
          {
             System.out.println(e);
          }
     }
}
