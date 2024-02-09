//Write a Java program to create a class called Animal with a method called makeSound().
//Create a subclass called Cat that overrides the makeSound() method to meow.

class Animal
{
    public void colour()
    {
        System.out.println("greeen");
    }
    public void makeSound()
    {
        System.out.println("coco");
    }

}
class Cat extends Animal
{
    public void makeSound()
    {
        System.out.println("MEOW ");
    }

}


public class testsample_inheritance 
{
    public static void main(String[] args) 
    {
        Cat obj=new Cat();
        
        obj.colour();
        obj.makeSound();
    }
    
}
