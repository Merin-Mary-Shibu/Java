import java.util.*;
class Employee
{
    Scanner obj = new Scanner(System.in);
    String name,address;
    int age;
    long phno;
    float salary;
    void input()
     {
         System.out.print("Enter Name: ");
         name=obj.nextLine();
         System.out.print("Enter Age: ");
         age=obj.nextInt();
         obj.nextLine(); 
         System.out.print("Enter Address: ");
         address=obj.nextLine();
         System.out.print("Enter Phone Number: ");
         phno=obj.nextLong();
         System.out.print("Enter Salary: ");
         salary=obj.nextInt();
     }  
    
    void display()
    {
        System.out.print("\nName : "+name+"\nAge: " +age+"\nAddress: "+address+ "\nPhone Number: "+phno);
    }
    void print_salary()
    {
        System.out.print("\nSalary: "+salary+"\n"); 
    }
}   

class Officer extends Employee
{
   String Specialisation;
   void read_officer()
   {
       System.out.print("Enter details of the Officer:\nEnter the Specialisation: ");
       Specialisation = obj.nextLine();    
   }  
   void print_officer()
   {
       System.out.println("\nDetails of the Officer:\nSpecialisation: "+Specialisation);
   }  
}

class Manager extends Employee
{
  String Department; 
  void read_manager() 
  {
    System.out.print("\nEnter details of the Manager:\nEnter the Department: ");
    Department = obj.nextLine();    
  } 
  void print_manager()
   {
       System.out.println();
       System.out.println("Details of the Manager:\nDepartment: "+Department);
   }  
} 

class OfficerManager
{
  public static void main(String[] args) 
  {
    Officer obj1 = new Officer();
    obj1.read_officer();
    obj1.input();
    Manager obj2 = new Manager();
    obj2.read_manager();
    obj2.input();
    obj1.print_officer();
    obj1.display();
    obj1.print_salary();
    obj2.print_manager();
    obj2.display();
    obj2.print_salary();
   } 
}
