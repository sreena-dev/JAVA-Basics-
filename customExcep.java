class MyException extends Exception
{
    public MyException(String str)
    {
        super(str);//to call the parent class obj user spr
    }
    
}

class MyExceptionWithoutParam extends Exception{
    public MyExceptionWithoutParam(){
        System.out.println("Printing from MyEXcepWithoutParam ");
    }
}

public class customExcep {
    
    public static void main(String[] args) {
        int arr[]={0,9,4};
        try{
            
            for(int i=0;i<3;i++)
            {
                if(arr[i]==0)
                {
                    System.out.println("1,2,3");
                    //throw new MyException("its zero");
                    throw new MyExceptionWithoutParam();
                }
                else{
                    System.out.println("no exception ");
                    //break;
                }
            }
        }
        catch(MyExceptionWithoutParam e)
        {
            //e.printStackTrace();//class name ,location(main class where the exception in occoured)
            System.out.println("default one from " + e);//its just giving the class name 
        }
    }
}
