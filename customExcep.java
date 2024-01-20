class MyException extends Exception
{
    public MyException(String str)
    {
        super(str);//to call the parent class obj user spr
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
                    throw new MyException("its zero");
                }
                else{
                    System.out.println("no exception ");
                    //break;
                }
            }
        }
        catch(MyException e)
        {
            //e.printStackTrace();
            System.out.println("default one from " + e);
        }
    }
}
