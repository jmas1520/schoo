
import java.util.Scanner;

public class Exe12_1_CarSubTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner (System.in);
		
		Exe12_1_CarSub mycar = new Exe12_1_CarSub("",1885,1490,5220,90.0,new Exe12_1_Day(200,11,18),0.0);
		
		do {
			System.out.print("X�����̈ړ����� �F ");
			double dx = stdIn.nextDouble();
			System.out.print("Y�����̈ړ����� �F ");
			double dy = stdIn.nextDouble();
			
			mycar.setTotalMileage(dx,dy);
			
			System.out.printf("�����s������%.2f\n",mycar.getTotalMileage());
			System.out.print("���s�𑱂���@Yes�E�E�E1 / No�E�E�E0 �F ");
		}while(stdIn.nextInt() == 1);
		

	}
}
