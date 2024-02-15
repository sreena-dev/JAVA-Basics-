import java.io.*;

public class FileInputStreamInJava {
   public static void main(String[] args) //throws Exception {
    {
        try{
        String data="New trial THE contents by file io stream";
        
        FileOutputStream out=new FileOutputStream("FileOut.txt");
        byte[] array=data.getBytes();
        out.write(array); 
        
        InputStream in=new FileInputStream("FileOut.txt");
        in.read();
        System.out.println(data);

        out.close();
        in.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}
