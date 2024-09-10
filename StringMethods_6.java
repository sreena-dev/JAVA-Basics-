package basics;

public class StringMethods_6 {
	public static void main(String[] args) {
		String test="uno dos thres 7 hala madrid ronaldo";
		
		System.out.println(test.length());
		System.out.println(test.charAt(5));
		System.out.println(test.substring(4));
		System.out.println(test.substring(5,9));
		
		//regex expression is supported ^__^ cool
		String regex="\\d";
		String[] testToArray=test.split(regex);
		for(int i=0;i<testToArray.length;i++) {
			System.out.println(testToArray[i]+" ");
		}
		
		int excludeOccourance=10; //excludes 10  index and then search after 10
		System.out.println(test.indexOf('d',excludeOccourance));
		
		System.out.println(test.lastIndexOf('r'));
		
		System.out.println(test.concat(" disse ronaldo"));
		
		System.out.println(test.trim());
		
		System.out.println(test.startsWith("uno"));
		
		System.out.println(test.toUpperCase());
		
		System.out.println(test.toLowerCase());
		
		System.out.println(test.endsWith("d")); //concat didn't reflect the change 
		
		String test2="hala madrid";
		
		System.out.println(test.equalsIgnoreCase(test2));
		
		System.out.println(test.equals(test2));
		
		System.out.println(test.replace('m','M'));
		
		System.out.println(test.replaceFirst("u","U"));
		
		System.out.println(test.replaceAll("ronaldo","Cristiannno Ronaldo").toUpperCase());
		
		System.out.println(test.compareTo("Uno "));
		
		
	}
}
