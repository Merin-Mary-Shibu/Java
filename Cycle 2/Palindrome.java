import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=obj.next();
		int i,c=0,j=s.length();
		for(i=0;i<j/2;i++)
		{
		    char ch=s.charAt(i);
		    char cha=s.charAt(j-i-1);
		    if(cha==ch)
		        c++;
		}
		if(c>=0 && c!=s.length()/2)
			System.out.println("The string is not a palindrome");
		else if(c==s.length()/2)
			System.out.println("The string is a palindrome");
	}
}
