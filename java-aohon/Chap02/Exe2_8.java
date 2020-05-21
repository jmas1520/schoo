
//演習2-8

import java.util.Scanner;
import java.util.Random;

class Exe2_8{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("整数値：");
		int x = stdIn.nextInt();
		int y = x-5;
		
		
		int lucky = rand.nextInt(11) + y;
		System.out.println("その値の±5の乱数を生成しました。それは" + lucky + "です。");
	}
}
