package basics;

class class1 extends Exception{
	class1(){
		super("error from class 1 that says num < 0");
	}
	class1(String param){
		super(param);
	}
}
public class ExceptionHandling_15 {
	public static void main(String[] args) throws class1{
		int val=-9;
		if(val>0) {
			throw new class1("error");
		}
		else {
			System.out.println();
		}      
//		try {
//			int a=10;
//			int b=0;
//			System.out.println(a/b);
//		}
//		catch(Exception e) {
//			System.out.println("b is a z"+e);
//		}
	}
}
