package basics;

public class StringBuilderMethods_7 {
	public static void main(String args[]) {
		StringBuilder sc=new StringBuilder("Ronaldo ");
		System.out.println(sc.append("cristiano")); 
		//diff btwn append aand concat is that spacing is there in concat but there is no spacing in append
		
		System.out.println(sc.replace(7,8," ronaldo "));
		System.out.println(sc.delete(0, 8));
	}
}
