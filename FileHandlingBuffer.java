// import java.io.FileWriter;
// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.FileReader;
// import java.io.IOException;
import java.io.*;

public class FileHandlingBuffer {
    public static void main(String[] args) {
        try{
            // FileOutputStream fo=new FileOutputStream("file.txt");
            // System.out.println("file created successfully ");
            // fo.close();


            String aa="oop";
            BufferedWriter bw=new BufferedWriter(new FileWriter("file.txt"));
            bw.write("this my frst content in file \n");
            bw.write(aa);
            bw.close();     
            
            BufferedReader br=new BufferedReader(new FileReader("file.txt"));
            String find;
            while((find=br.readLine())!=null){
                if(find.contains("my")){
                    System.out.println(find);
                    
                    break;
                }
            }
            br.close();
        }
           
        catch(IOException e){   
            e.printStackTrace();
        }


    }
}
