import java.util.Scanner;

public class Exe10_4_DayTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int y,m,d;
		
		Exe10_4_Day a = new Exe10_4_Day();
		System.out.println(a.getYear() + "年" + a.getMonth() + "月" + a.getDate() + "日");
		
		System.out.println("日付を入力せよ。");
		System.out.print("年 ： ");
		y = stdIn.nextInt();
		System.out.print("月 ： ");
		m = stdIn.nextInt();
		System.out.print("日 ： ");
		d = stdIn.nextInt();
		
		Exe10_4_Day b = new Exe10_4_Day(y,m,d);
		System.out.println(b.getYear() + "年" + b.getMonth() + "月" + b.getDate() + "日");
		
		System.out.println("年内の経過日数は" + b.DateProgress() + "日です。");
		
	}
}
