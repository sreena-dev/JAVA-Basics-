import java.io.*;

public class FileHandling {
    public static void main(String[] args) throws FileNotFoundException,IOException{
        File f=new File("My_frst_file_created.txt");
            if(!f.exists()){
                System.out.println("File not Exist ");
            }
            else{
                 
                System.out.println("File Exist " );
            }
        
        // catch(FileNotFoundException e){
        //     System.out.println(e.getStackTrace());
        // }
            // if(!f.exists()){
            //     System.out.println("File Exist ");
            // }
            // else{
            //     System.out.println("File Does not Exist " );
            // }    
           
        
    }
}
