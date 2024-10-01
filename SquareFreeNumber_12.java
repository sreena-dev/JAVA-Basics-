package basics;

import java.util.*;
public class SquareFreeNumber_12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i*i<=n;i++){
        	if(n%(i*i)==0){
        		System.out.println("NSFN");
        		break;
            }
        	else{
        		System.out.println("SFN");
        		break;
        	}
        }
        
        
//        System.out.println(m1(n));
//
//        if(m1==1){
//            System.out.println("SFN");
//        }
//        else{
//            System.out.println("NSFN");
//        }
//        
    }
}