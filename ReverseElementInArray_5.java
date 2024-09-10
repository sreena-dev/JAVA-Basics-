package basics;

public class ReverseElementInArray_5 {
	public static void main(String[] args) {
		String[] arr= {"apple","banana","grapes"};
		String line="apple banana grapes";
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		//what if its a sentence ;)
		String[] lineToArray=line.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(lineToArray[i]+" ");
		}
		
		System.out.println();
		//to reverse the words in a sentence 
		String line2="apple banana grapes";
		char charLine2[] =line2.toCharArray();
		for(int i=line2.length()-1;i>=0;i--) {
			System.out.print(charLine2[i] );
		}
		
	}
}
