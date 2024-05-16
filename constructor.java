// ACTUALLY CREATED THE PRIVATE DATA AND I ACCESSED IT THROUGH METHODS NOW ASSIGNING VALUES TO IT.


class consts
{
    private int age;
    private String name;

    //CONSTRUCTOR HERE

    public consts(int age,String  n1)
    {
        //age=a1;      //you can do it with this keyword also so you no need stuffs 
                      //like a1 or n1 or a new variable
        this.age=age;  //when you just wanted to switch over create int age 
        name=n1;
    }

    public int getage()
    {
        return age;
    }

    public String getname()
    {
        return name;
    }
}

public class constructor
{
    public static void main(String[] args) {
        consts c= new consts(2,"ssfd");
        System.out.println(c.getage() + " " + c.getname());
    }
}
