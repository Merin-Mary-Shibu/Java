import java.util.*;
class Frequency
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=obj.next();
		int i,c=0,j=s.length();
		System.out.println("Enter the character whose frequency is to be found");
		char ch=obj.next().charAt(0);
		for(i=0;i<j;i++)
		{
		    char cha=s.charAt(i);
		    if(cha==ch)
		    {
		        c=c+1;
		    }
		}
		System.out.printf("The character occurs %d times",c);
	}
}
