//THIS IS THE IDEA BEHIND ENCAPSULATION.... WHEN THE INSTANT VARIABLES
//ARE DECLARED TO BE PRIVATE THEN IT CANNOT BE ACCESSEB BY OTHER
//CLASS SO WE USE THE METHOD TO ACCESS THE VARIABLE FROM THE CLASS 
//ALL THE METHODS AND CLASS CREATED ARE THE EXAMPLE FOR ENCAPSULATION..

// Encapsulation is a fundamental concept in object-oriented programming (OOP) that
// refers to the bundling of data and methods that operate on that data within a single unit, 
// which is called a class. It is a way of hiding the implementation details of a class from 
// outside access and only exposing a public interface that can be used to interact with the class 

// In Java, encapsulation is achieved by declaring the instance variables of a class as private, 
// which means they can only be accessed within the class. To allow outside access to the instance 
// variables, public methods called getters and setters are defined, which are used to retrieve and 
// modify the values of the instance variables, respectively 

class check
{
    private String name;
    private int num;

    public int getInt()
    {
        return num;
        
    }
    public String getStr()
    {
        return name;
    }

    public void setInt(int i)
    {
        num=i*10; //i can actually perform any operations here 
    }
    public void setStr(String s)
    {
        name=s;
    }

}

class Encapsulation
{
    public static void main(String args[]) 
    {
        check obj= new check();
        obj.setStr("nana");
        obj.setInt(10);

        System.out.println(obj.getStr());
        System.out.println(obj.getInt());
    }
}