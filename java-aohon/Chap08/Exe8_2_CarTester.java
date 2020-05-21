
import java.util.Scanner;

public class Exe8_2_CarTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("車のデータを入力してださい。");
		System.out.print("名前 ： ");
		String name = stdIn.next();
		System.out.print("ナンバー（例・あ-４-20） ： ");
		String number = stdIn.next();
		System.out.print("車幅(mm) ： ");
		int width = stdIn.nextInt();
		System.out.print("車高(mm) ： ");
		int height = stdIn.nextInt();
		System.out.print("車長(mm) ： ");
		int lenght = stdIn.nextInt();
		System.out.print("ガソリン量(l) ： ");
		double fuel = stdIn.nextDouble();
		
		Exe8_2_Car myCar = new Exe8_2_Car(name,number,width,height,lenght,fuel);
		
		while(true) {
			System.out.printf("現在地（%.1f, %.1f)・残り燃料%.1f[l]\n",myCar.getX(),myCar.getY(),myCar.getFuel());
			System.out.print("移動しますか[0・・・No / 1・・・Yes] : ");
			if(stdIn.nextInt() == 0) {
				break;
			}
			
			System.out.print("X方向の移動距離 ： ");
			double dx = stdIn.nextDouble();
			System.out.print("Y方向の移動距離 ： ");
			double dy = stdIn.nextDouble();
			
			if(!myCar.move(dx, dy) ) {
				System.out.println("燃料が足りません！");	
			}
			
			System.out.print("給油しますか[0・・・No / 1・・・Yes] : ");
			if(stdIn.nextInt() == 1) {
				System.out.print("給油量(l) ： ");
				double f = stdIn.nextDouble();
				System.out.printf("残り燃料は%.1fです。\n",myCar.Refuel(f));
			}
		}
		
		
	}

}
