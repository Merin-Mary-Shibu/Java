import java.util.*;
class StudentDetails
{
	public static void main(String[] args)
	{ 
		Student obj = new Student();
		obj.read();
		obj.print();
	}
}

class Student
{
    int i,r;
    String n;
    int s[] = new int[5];
    
    void read()
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter name of the student: ");
        n = obj.nextLine();  
        System.out.print("Enter roll no.: ");
        r = obj.nextInt();
        System.out.print("Enter mark of subjects: \n");
        for(i=0;i<5;i++)
             {
               System.out.print(""+(i+1)+ " = ");
               s[i] = obj.nextInt();
             }
    }

    void print()
    {
        System.out.println("Name : "+n);
        System.out.println("Roll no. : "+r);
        for(i=0;i<5;i++)
             {
               System.out.println("Mark of subject "+(i+1)+ " = "+s[i]);
             }
    }
}
