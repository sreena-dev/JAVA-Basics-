class A extends Thread{
    public void run(){
        for(int i=0;i<20;i++){
    System.out.println("hai 1");
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<20;i++){
    System.out.println("hai       2");
        
        }
    }
}
public class ThreadClassExtends
{
    public static void main(String[] args) {
        A a=new A();
        B b=new B();

        a.start();
        b.start();
    }
}
//Its a general working of the thread by extending the thread class