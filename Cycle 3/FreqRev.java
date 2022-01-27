import java.util.*;
class FreqRev
{
	public static void main(String args[])
	{ 
	   int i;
       Scanner obj = new Scanner(System.in);
	   System.out.println("Enter the string");
       String s=obj.nextLine();
       int l=s.length();
       char a[]=new char[l];
       for(i=0;i<l;i++)
        a[i]=s.charAt(i);
	   Strings obj1 = new Strings();
	   obj1.Frequency(a,l);
	   obj1.Reverse(a,l);
	}
}
	    
	    
class Strings
{
    void Frequency(char a[],int n)
     {
        int i,c=0;
        Scanner obj = new Scanner(System.in);
	    System.out.print("Enter a character whose frequency is to be found :");
	    char y = obj.next().charAt(0);
	    
	    for(i=0;i<n;i++)
	         if(a[i] == y)
	             c = c + 1;
	    System.out.println("Frequency of entered character is "+c);
     }

    void Reverse(char a[],int n)
    {
        int i;
        System.out.println("The reversed string is: ");
        for(i=n-1;i>=0;i--)
        {
            System.out.print(a[i]);
        }
    }
}
