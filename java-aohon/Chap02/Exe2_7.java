
//演習2-7

import java.util.Random;

class Exe2_7{
	public static void main(String[] args){
		Random rand = new Random();
		
		int lucky1 = rand.nextInt(9) + 1;
		System.out.println("今回の1桁の正の整数値は" + lucky1 + "です。");
		
		int lucky2 = rand.nextInt(9) - 9;
		System.out.println("今回の1桁の負の整数値は" + lucky2 + "です。");
		
		int lucky3 = rand.nextInt(90) + 10;
		System.out.println("今回の2桁の正の整数値は" + lucky3 + "です。");
	}
}
