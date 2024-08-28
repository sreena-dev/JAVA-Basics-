package basics;
import java.util.*;

public class ArrayMergeSortDiffSize {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int arr1_size=3;
		int arr2_size=5;
		int arr[]=new int[arr1_size];
		int arr2[]=new int[arr2_size];
//Scanner
		for(int i=0;i<arr1_size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr2_size;i++) {
			arr2 [i]=sc.nextInt();
		}
//new array and merge elements size
		int total_merge_size=arr1_size+arr2_size;
		int final_merge_array[]=new int[total_merge_size];
		
//merge array 1
		for(int i=0;i<arr1_size;i++) {
			final_merge_array[i]=arr[i];
		}
//instead of i use any one variable as use i++ 
		for(int i=0;i<arr2_size;i++) {
			final_merge_array[arr1_size+i]=arr2[i];
		}
//sort predefined method
		Arrays.sort(final_merge_array);
		
//print final array
		for(int i=0;i<total_merge_size;i++) {
			System.out.print(final_merge_array[i]);
		}
		
//remove duplicates by assigning repeated element as 0 
		for(int i=0;i<total_merge_size;i++) {
			for(int j=i+1;j<total_merge_size;j++) {
				if(final_merge_array[i]==final_merge_array[j]) {
					final_merge_array[j]=0;
				}
			}
		}
//print the element which are not = to 0
		for(int i=0;i<total_merge_size;i++) {
			if(final_merge_array[i]!=0) {
				System.out.print(final_merge_array[i]);
				}
		}
//output will be little messy due to lack of print new line statement but eventually is the correct one 
		
		
//remove duplicates oda vera syntax by the means of count and new array creation
		int soni[]=new int[100];
		for(int j=0;j<total_merge_size;j++) { 
			//input->  7 5 3 6 7 9 3 9 
			//         0 0 0 1 0 1 1 1 <- soni count assignment
			soni[final_merge_array[j]]++;
//			System.out.println("soni[j] "+soni[j]);
//			System.out.println(soni[final_merge_array[j]]);
		}
		
		
		for(int j=0;j<total_merge_size;j++) {
			if(final_merge_array[j]>0) {
				System.out.println(final_merge_array[j]);
				int i=0;
				soni[final_merge_array[i]]=0;
			}
		}
		
		sc.close();	
	}
	
}
