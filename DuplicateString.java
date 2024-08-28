package basics;

public class DuplicateString {
	public static void main(String[] args) {
		String inUser="hhhhhhhhhhhelo";
		char out=' ';
		
		char in[]=inUser.toCharArray();
		for(int i=0;i<inUser.length();i++) {
			for(int j=i+1;j<inUser.length();j++) {
				if((in[i]==in[j]) && in[i]!=' ') {
					out=in[i];
					
				}
			}
		}
		System.out.println(out);
		
	}

}
