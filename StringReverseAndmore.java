package basics;

import java.util.*;

public class StringReverseAndmore {

	public static void main(String[] args) {
//reverse
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		char out=' ';
		for(int i=a.length()-1;i>=0;i--) {
			System.out.print(a.charAt(i));
		}
		
		System.out.println();
		
//char after 2 symbol
		for(int i=0;i<a.length();i++) {
			if((a.charAt(i))=='@')
				for(int j=i+1;j<a.length();j++) {
					System.out.print(a.charAt(j));
				}
		}
		
//remove duplicates in string
		String str1="ronaldo";
		String empty=" ";
		
		char[] string1=str1.toCharArray();
		
		for(int i=0;i<str1.length();i++) {
			for(int j=i+1;j<str1.length();j++) {
				if(string1[i]==string1[j]) {
					string1[j]='0';
				}
			}
		}
		System.out.println();
		for(int i=0;i<str1.length();i++) {
			if(string1[i]!='0') {
				System.out.print(string1[i]);
			}
		}
		System.out.println();
// remove the mentioned char
		String input="gokilla";
		char toRemove='l';
		char[] inputC=input.toCharArray();
		for(int i=0;i<input.length();i++) {
				if(inputC[i]!= toRemove) {
					System.out.print(inputC[i]);
			}
		}
		
	}
}
