class D extends Thread{
    public void run(){
        try {
            System.out.println("area");
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

}
class E extends Thread{
    public void run(){
        
        try{
            System.out.println("Sum");
            Thread.sleep(5000);
        }
        catch(Exception e){

        }
    }
}

public class Checker {
    public static void main(String[] args) {
        D d=new D();
        E e=new E();
        d.setPriority(Thread.MAX_PRIORITY);

        d.start();
        e.start();
    }
    
}
