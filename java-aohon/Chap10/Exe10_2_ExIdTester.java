
import java.util.Scanner;

public class Exe10_2_ExIdTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int dis = 0,n = 0;
		
		Exe10_2_ExId a = new Exe10_2_ExId(dis,n);
		Exe10_2_ExId b = new Exe10_2_ExId(dis,n);
		
		System.out.println("aの識別番号 ： " + a.getExId());
		System.out.println("bの識別番号 ： " + b.getExId());
		
		do {
			System.out.print("カウントを変更しますか 1・・・Yes / 0・・・No ： ");
			dis = stdIn.nextInt();
			if(dis == 0) {
				break;
			}
		}while(dis != 1);
		
		if(dis == 1) {
			System.out.print("カウント値はいくつに変更しますか ： ");
			n = stdIn.nextInt();
		}
		
		Exe10_2_ExId c = new Exe10_2_ExId(dis,n);
		Exe10_2_ExId d = new Exe10_2_ExId(dis,n);
		
		System.out.println("cの識別番号 ： " + c.getExId());
		System.out.println("dの識別番号 ： " + d.getExId());
		
	}
}
