 class Car 
{
    public void playmusic()
    {
        System.out.println("yeahhhhh you played a music");
    }
}

abstract class Innova 
{
  
    abstract public String drive(String saccel);//just checked with parameters 

    public void Haveone()
    {
        System.out.println("i like innova ");
    }
}

class swift extends Innova
{
    public String drive(String accels)
    {
        return accels;
        // System.out.println("yyeahhh i got it ");
        // System.out.println("i like swift also sometimes ");
    }
    
}
public class Abstraction_check 
{
    public static void main(String[] args) 
    {
        swift c=new swift();
        c.Haveone();  
        System.out.println(c.drive("yeahh 80 noww "));
    }
    
}
