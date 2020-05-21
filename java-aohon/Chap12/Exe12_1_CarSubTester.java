
import java.util.Scanner;

public class Exe12_1_CarSubTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner (System.in);
		
		Exe12_1_CarSub mycar = new Exe12_1_CarSub("",1885,1490,5220,90.0,new Exe12_1_Day(200,11,18),0.0);
		
		do {
			System.out.print("X方向の移動距離 ： ");
			double dx = stdIn.nextDouble();
			System.out.print("Y方向の移動距離 ： ");
			double dy = stdIn.nextDouble();
			
			mycar.setTotalMileage(dx,dy);
			
			System.out.printf("総走行距離は%.2f\n",mycar.getTotalMileage());
			System.out.print("走行を続ける　Yes・・・1 / No・・・0 ： ");
		}while(stdIn.nextInt() == 1);
		

	}
}
