class EX extends Exception 
{
    public EX(String got) 
    {
        super(got); 
        //System.out.println("ex in EX that is my exc"); //not actually need you can give it like this also
    }

}

public class samplethrow {
    public static void main(String[] args) {
        
        try{
            int a=10/2;
            if (a==5)
            {
                throw new EX("my exception a=5 actually ,so you dont need 5");
            }
            System.out.println("no exc its not 5");
        }
        
        catch(EX e)
        {
            System.out.println(e);
            //System.out.println("exception handeled ");
        }
        
    }
}
//you are throwing a custom exception and catching it in the cat block with your custom name and a custom exception class is also created
//in the output EX is the Cutsom exception name and the msg printed is from the super keyword that is getting the string in the constructor
//without the super keyword you cant get that msg in the throw



