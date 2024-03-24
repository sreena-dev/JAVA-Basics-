//Write a Java program to create a class called Shape with a method called getArea(). 
//Create a subclass called Rectangle that overrides the getArea() method 
//to calculate the area of a rectangle.


class Shape
{
    public int len;
    public int len2;

    void getArea(int len,int len2)
    {
        this.len=len;
        this.len2=len2;
        System.out.println("from the shape class " + len + " " + len2);
    }

}
class Rectangle extends Shape
{
    void getArea(int len,int len2)
    {
        System.out.println("from the rectangle class " + len*len2);
    }
}

class Square extends Rectangle
{
    @Override
    void getArea(int len,int len2)
    {
        System.out.println("from the square class " + len*len2*len2);
    }
}

public class RECTANGLEtestsample_inheritance2
{
    public static void main(String[] args) 
    {
        Square obj=new Square();
        obj.getArea(5,4);
        //obj.getArea(5,4);
    }
}
//ITS OVERRIDEN(getArea()) therby prints the overriden method only and skips the original case
//in general it take the method in the child class.