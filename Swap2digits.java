package basics;

public class Swap2digits {
	public static void main(String[] args) {
		 
//		String n="1223452";
//		String temp="";
//		String index = "";
//		for(int i=0;i<n.length();i=+2) {
//			index=n.substring(i);
//			temp=index;
//			index=temp;		
//		}
//		for(int i=0;i<n.length();i++) {
//			System.out.println(index);
//		}
		
		int n=6;
		int arr[]= {1,65,8,6,9,4};
		for(int i=0;i<n-1;i=+2) {
			arr[i]=arr[i]^arr[i+1];
			arr[i+1]=arr[i]^arr[i+1];
			arr[i]=arr[i]^arr[i+1];
		}
		for(int i=0;i<6;i++) {
			System.out.println(arr[i]);
			System.out.println("hello");
		}
	
		
		int num=123485;
		int rev=0;
		int s=0;
		for(int i=num;i>0;i=i/10) {
			rev=rev*10+(i%10);	
		}
		for(int i=rev;i>0;i=i/100) {
			s=s*100+(i%100);
	
		}
		System.out.println(s);
		
		int num2=12345;int revs=0,sam=0,c=0;
		for( ;num2>0;revs=revs*10+(num2%10),num2=num2/10,c++);
		for( ;revs>0;sam=sam*100+revs%100,revs=revs/100);
		System.out.println((c&1)!=1? sam/10+(revs%10):sam);
		
	}
}
