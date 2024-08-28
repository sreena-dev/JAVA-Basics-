package basics;
import java.util.*;

public class Switch {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String switchstr=sc.next();
		
		switch(switchstr) {
		
		case "mon":
			System.out.print("MONDAY");
			break;
			
		case "tue":
			System.out.print("MONDAY");
			break;
			
		case "wed":
			System.out.print("MONDAY");
			break;
			
		case "thur":
			System.out.print("MONDAY");
			
		default:
			System.out.println("ENTER A VALID DAY");
		}
		sc.close();
		
	}
}
