import java.util.*;
public class ReplaceChar 
{
    public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		String s;
		System.out.println("Enter the string:");
		s=obj.nextLine();
		char c,r;
		System.out.println("Enter the character to be replaced:");
		c=obj.next().charAt(0);
	    System.out.println("Enter the character to be placed instead:");
		r=obj.next().charAt(0);
	    s=s.replace(c,r);
		System.out.println("New string: "+s);
		
	}
}
