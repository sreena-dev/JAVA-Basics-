//Suppose you are designing a system for a school, and you have different
// types of students: regular students and honors students. All students have a name and an ID, 
//and they can calculate their average marks using inheritance in java
//Implement it using inheritance and Interface in Java

interface Regular_Student
{
    public String mode();
    public int working_days();
    public int marks_R(int m1,int m2);
}

interface Honors_Student
{
    public String mode_H();
    public int working_days_H();
    public int marks_H(int n1,int n2);   
}

class Student_details
{
    public int ID;
    public String name;

    int getID(int ID)
    {
        return ID;
    }

    String getName(String name)
    {
        return name;
    }
}

class detials extends  Student_details implements Regular_Student , Honors_Student 
{
    public int Average(int n1,int n2)
    {
        return (n1*n2)/2;
    }
//honor
    public String mode_H()
    {
        return "honors";
    }
    public int working_days_H()
    {
        return 50;
    }
    public int marks_H(int n1,int n2)
    {
        return n1 + n2;
    }
//regular
    public String mode()
    {
        return "Regular";
    }

    public int working_days()
    {
        return 90;
    }
    public int marks_R(int m1,int m2)
    {
        return m1 + m2;
    }
}

public class interface_check 
{ 
    public static void main(String[] args) 
    {
        //Student_detials s= new Student_detials(46,"sreena" );
        detials obj=new detials();
        System.out.println(obj.mode_H());
        System.out.println(obj.marks_H(80,90 ));

    }
}
    
