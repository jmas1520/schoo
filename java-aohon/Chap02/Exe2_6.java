
//演習2-6

import java.util.Scanner;

class Exe2_6{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("三角形の面積を求めます。");
		
		System.out.print("底辺：");
		double x = stdIn.nextDouble();
		System.out.print("高さ：");
		double y = stdIn.nextDouble();
		
		System.out.println("面積は" + x*y/2 + "です。");
	}
}
