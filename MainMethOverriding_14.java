package basics;

class MainMethod  {
	public static void main(int a,int b) {
		System.out.println("sum from class where the main meth is over written = "+ (a+b));
	}
}
public class MainMethOverriding_14  {
	public static void main(String[] args) {
		System.out.println("original main method");
		
		MainMethod.main(5, 6);
	}
}

//commented lines are the proof that method overloading is possible in the main method 