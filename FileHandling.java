package basics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandling {
	public static void main(String args[]) {
		try {
			File f=new File("sampleFile.txt");
			FileWriter f2=new FileWriter("sampleFile2.txt");
			f2.write("sdfhygf essssssssssryfhxsduh e rceuirhyy buuuuu uuugydjfgfhgh rtyurtgfgfg fgfhdtruhy");
			System.out.println("writing done in file 2");
			if(f.createNewFile()) {
				System.out.println("File Created "+f.getName());
			}
			else {
				System.out.println("Not created");
			}
			f2.close();
		}
		catch(IOException e) {
			System.out.println("Error");
		}
	}
}
