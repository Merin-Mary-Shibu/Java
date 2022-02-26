class ArrayIndex
{
  public static void main(String[] args)
  {
      try
      {
        int a[]=new int[10];
        System.out.println(a[14]);
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
        System.out.println(e);
      }
  }
}
