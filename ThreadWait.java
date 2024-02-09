import java.util.*;
class Library implements Runnable{
        Scanner sc=new Scanner(System.in);
       
        int cNum;
        String BookName;
        
        public Library(int cNum ,String BookName){
            this.cNum=cNum;
            this.BookName=BookName;
        }
        
        public synchronized void run(){
            
            try{
                Thread.sleep(3000);
                System.out.println("BOOK INFORMATION "+ cNum + BookName);
                System.out.println("BOOK ISSUE SUCCESSFUL ");
            }
            catch(InterruptedException e){

            }
        }
}
public class ThreadWait{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int cNum=sc.nextInt();
        String BookName=sc.nextLine(); 
        
        Library oop=new Library(cNum,BookName);
        Thread t=new Thread(oop);
        t.start();
        
        sc.close();
    }
    
}