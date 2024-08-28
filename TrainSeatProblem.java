package basics;
import java.util.*;


public class TrainSeatProblem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int seat_num=sc.nextInt();
		
		if(seat_num<72) {
			System.out.println("Seat Number= "+ seat_num);
			int location= seat_num%8;
			String pos= location==1 || location== 4? "upper Berth":
				        location==2 ||location== 5? "middle berth":
				        location==3 ||location==  6? "lower berth":
				        location==7? "side uppper birth":
				        location==0? "side lower berth":"invalid";
			System.out.println("Berth Position = "+pos);
		}
		sc.close();
	}
}
