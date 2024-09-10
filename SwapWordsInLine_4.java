package basics;

public class SwapWordsInLine_4 {
	public static void main(String[] args){
		
		String line="she has Accentuating accent dude";
		String[] lineArray=line.split(" ");
		String temp;
		for(int i=0;i<lineArray.length-1;i+=2) {
			temp=lineArray[i];
			lineArray[i]=lineArray[i+1];
			lineArray[i+1]=temp;
		}
		for(int i=0;i<lineArray.length;i++) {
			System.out.print(lineArray[i]+" ");
		}
	}
}
