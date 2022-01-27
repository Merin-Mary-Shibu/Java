import java.util.*;
class Perimeter
{
	public static void main(String args[])
	{ 
       Scanner obj = new Scanner(System.in);
       int r,l,b;
       System.out.print("Enter radius of circle :");
       r = obj.nextInt();
       
       System.out.print("Enter length and breadth of rectangle: \n");
       l = obj.nextInt();
       b = obj.nextInt();
       
       Perimeter obj1 = new Perimeter(r);
       obj1 = new Perimeter(l,b);
    }
}

class Perimeter
{
    Perimeter(int radius)
    {
        double p = 3.14*2*radius;
        System.out.println("Perimeter of circle = "+p);
    }
    
    Perimeter(int length,int breadth)
    {
        double p = 2*(length+breadth);
        System.out.println("Perimeter of rectangle = "+p);
    }
    
}
