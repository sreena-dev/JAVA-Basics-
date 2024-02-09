//IF PRIVATE YOU KNOW YOU HAVE TO CREATE METH & CALL THEM THROUGH THEIR METH NAME
//IF PUB, CREATE A CONSTRUCTOR REFER THE IDENTIFIER THAT NEED TO BE REPEATED AND USE THIS & 
//USE CONSTRUCTOR IN CASE YOU NEED TO SET A DEFAULT VALUE FOR DEFAULT VALUE
//Lines 24-28 & 49-51 are so special 
//they are the heart of how this keyword works now to replace all these operations done at the 
//backend this keyword is used; ots just by passing the obj to the method

class thisone
{
    public String name;
    public int age;

    public String getName(String name)
    {
        return this.name;
    }

    public int getAge(int age)
    {
        return this.age;
    }


    // public void getAge(int age, thisone t)
    // {
    //     thisone t2=t;
    //     t2.age=age;
    // }

    public thisone(String name,int age)
    {
        this.name=name;
        this.age=age;

    }

}
public class THIS
{
    public static void main(String[] args)
    {
        thisone t=new thisone("kail",13);
        System.out.println(t.getName("sreena") + " " + t.getAge(12));//for private 

        //its for public keyword
        System.out.println(t.name + " " + t.age);


        // thisone t=new thisone();
        // t.getAge(13,t);
        // System.out.println(t.age);

        
        
    }
}

