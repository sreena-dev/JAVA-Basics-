package basics;

public class FindRepeatedChar_3 {
	//works with index based on ASCII value
	public static void main(String[] args) {
		String line = "CR has a new YouTube Channel";
		int freqArray[]= new int[257];
		char charArray[] =line.toCharArray();
		for(int i=0;i<line.length();i++) {
			freqArray[charArray[i]]++;
		}
		for(int i=0;i<257;i++) {
			if(freqArray[i]>1) {
				System.out.println((char)i+" ");
			}
		}
		//only bug is that it includes the space 
		//so to remove the space find out the ASCII value of space 
		//that is 32 so do not print space
		
		for(int i=0;i<257;i++) {
			if(freqArray[i]>1 && i!=32) { //space removed 
				System.out.println((char)i+" ");
			}
		}
	}
}
