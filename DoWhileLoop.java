package basics;

public class DoWhileLoop {
	public static void main(String[] args) {
	
		//System.out.println("Loop");
		int n=10;
		do {
			//System.out.println(n);
			n--;
		}
		while(n>0);
		
		int[] arr= {10,3,4,5,6,7,8,9};
		System.out.println("Length of this array= "+arr.length);
		sampleClass sc=new sampleClass(67,89);
//		sc.add();
		
	}
}
class sampleClass{
	sampleClass(int a,int b){
		int ab=a;
		int ba=a;
	}
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
}
