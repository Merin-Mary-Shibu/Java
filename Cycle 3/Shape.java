import java.util.*;
class Shape
{
	public static void main(String args[])
	{ 
	   int r,l,b;
	   float ba,h;
       Scanner obj = new Scanner(System.in);
       System.out.print("Enter radius of the circle :");
       r = obj.nextInt();
       
       System.out.println("Enter length and breadth of rectangle :");
       l = obj.nextInt();
       b = obj.nextInt();
       
       System.out.println("Enter base and height of triangle :");
       ba = obj.nextInt();
       h = obj.nextInt();
       
       Shapes obj1 = new Shapes();
       obj1.Area(r);
       obj1.Area(l,b);
       obj1.Area(ba,h);
    }
}

class Shapes
{
    double Area;
    void Area(int radius)
    {
        Area = 3.14*radius*radius;
        System.out.println("Area of circle = "+Area);
    }
    
    void Area(int length,int breadth)
    {
        Area = length*breadth;
        System.out.println("Area of rectangle = "+Area);
    }
    
    void Area(float base,float height)
    {
        Area = (height*base)/2;
        System.out.println("Area of triangle = "+Area);
    }
}
