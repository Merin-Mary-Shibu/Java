import java.util.*;
class Search 
{
    public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int flag=0,i,n;
		String str;
		System.out.println("Enter a string :");
		str=obj.nextLine();
		n=str.length();
		System.out.println("Enter the character to be searched:");
		char s=obj.next().charAt(0);
		
		for(i=0;i<n;i++)
		{
			if(str.charAt(i)==s)
			{
				flag=1;
				break;
			}
		}
		
		if(flag==0)
		{
			System.out.println("Character not found");
		}
		else
		{
			System.out.println(s+" found at position "+(i+1));
		}
		
	}
}
