package basics;

public class Panagram_2 {
	public static void main(String[] args) {
		int count=0;
		String toCount="qwertyuioplkjhgfdszxcvnm";
		int freqArray[] = new int[26]
;		String convert=toCount.toUpperCase();
		for(int i=0;i<toCount.length();i++) {
			if(convert.charAt(i)>='A' && convert.charAt(i)<='Z')
			{
				freqArray[convert.charAt(i)-'A']++;
			}
		}
		for(int i=0;i<26;i++) {
			if(freqArray[i]>=1) {
				count++;
			}
		}
		
		if(count==26) {
			System.out.println("panagram");
		}
		else {
			System.out.println("not panagram");
		}
		
		//to find the missing element from the given string since ordered 
		for(int i=0;i<26;i++) {
			if(freqArray[i]==0) {
				System.out.println("The missing character from toCount string = "+(char)('A'+i));
			}
		}
		
		
	}
}
