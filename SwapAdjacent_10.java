package basics;

import java.util.*;
public class SwapAdjacent_10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n-1;i+=2){
            temp=arr[i+1];
            arr[i+1]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
