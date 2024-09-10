package basics;

public class FrequencyCount_1 {
	
	public static void main(String[] args) {
		
		//method 1 
//store the index of the main array to count in the freqArray and increment value 
//first consider arr[0] that is 9 next freqArray[9] is the position where increment  
//should be done and continue for all the element in the list
		int arr[] = {9,2,3,4,1,2};
		int freqArray[]= new int[257];
		for(int i=0;i<arr.length;i++) {
			freqArray[arr[i]]++;
		}
		for(int j=0;j<freqArray.length;j++) {			
			if(freqArray[j]>0) {
					System.out.println(j +" "+freqArray[j]);
			}
		}
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {			
				if(arr[i]==arr[j]) {
					count++;
				}
				System.out.println(count);
			}
		}
	}
	
}
