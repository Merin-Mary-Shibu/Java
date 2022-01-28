abstract class Shape
{
    abstract void numberofSides();
}

class Rectangle extends Shape
{
    void numberofSides()
    {
        System.out.println("Rectangle has 4 sides");
    }
}

class Triangle extends Shape
{
    void numberofSides()
    {
    System.out.println("Triangle has 3 sides");
    }
}

class Hexagon extends Shape
{
    void numberofSides()
    {
    System.out.println("Hexagon has 6 sides");
    }
}

class Shapes
{
    public static void main(String[] args)
    {
    Rectangle R = new Rectangle();
    R.numberofSides();
    Triangle T = new Triangle();
    T.numberofSides();
    Hexagon H = new Hexagon();
    H.numberofSides();
    }
}
