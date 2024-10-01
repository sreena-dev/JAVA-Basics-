package basics;

public class duplicateElementRemoval_9 {
	public static void main(String[] args) {
		int arr[]= {2,3,5,2,7,3};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[j]=0;
					arr[i]=0;
				}
//				else {
//					out[i]=arr[j ];
//				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				System.out.println(arr[i]);
			}
			
		}
	}
}
