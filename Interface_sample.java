interface A
{
    String a="INTERFACE CHECK"; //WE SHOULD ALWAYS SET THE OBJ TO STATIC(DECLARE THE OBJECTS VALUE) IN INTERFACE

    void show();
    void confi();
}

interface D
{ 
    void show2();
    void confi2();
}

class B implements D,A
{
    public void show()
    {
        System.out.println("its show");
    }
    public void confi()
    {
        System.out.println("its config");
    }

    public void show2()
    {
        System.out.println("its showss 2");
    }
    public void confi2()
    {
        System.out.println("its configss 2");
    }
}


public class Interface_sample
{
    public static void main(String[] args) 
    {
        B b=new B();
        //D b2=new B(); //its shows that you can create a single OBJECT(for the sub class) 
        //and access all the paret class that supports multiple inheritance..
        // some format that you need to remember is when you create a object is .. 
        // parent class obj_name= new subclass_name is the format ingeneral
        b.show();
        b.confi();
        b.show2();
        b.confi2();
        //System.out.println(A.a);
    }
}

