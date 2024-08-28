package basics;

public class SecondLargest {
	public static void main(String args[]) {
		int largest=0;
		int[] arr= {3,4,21,7,};
		for(int i=0;i<4;i++) {
			for(int j=i+1;j<4;j++) {
				if(arr[j]>arr[i]) {
					largest=arr[i];
				}
			}
		}
		System.out.println(largest);
	}
}
