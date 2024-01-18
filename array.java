import java.util.*;
public class array
{
    public static void main(String args[]) 
    {
        //int[] arr;
        int[] arr= new int[3];

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<(arr.length)-1;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<arr.length;i++){
            
            System.out.print(arr[i] +" ");
        }
        

        // for(int i:arr)
        // {
        //     System.out.print(i);
        // }
        sc.close();
    }
    
}
