
//演習2-9

import java.util.Random;

class Exe2_9{
	public static void main(String[] args){
		Random rand = new Random();
		
		double lucky1 = rand.nextDouble();
		System.out.println("0以上1.0未満の実数値の乱数を生成しました。それは" + lucky1 + "です。");
		
		double lucky2 = rand.nextDouble()* 10;
		System.out.println("0以上10.0未満の実数値の乱数を生成しました。それは" + lucky2 + "です。");
		
		double lucky3 = rand.nextDouble()* 2 - 1.0;
		System.out.println("-1.0以上1.0未満の実数値の乱数を生成しました。それは" + lucky3 + "です。");
	}
}
