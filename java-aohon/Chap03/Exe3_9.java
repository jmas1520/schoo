
//演習3-9

import java.util.Scanner;

class Exe3_9{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("実数a：");
		double a = stdIn.nextDouble();
		
		System.out.print("実数b：");
		double b = stdIn.nextDouble();
		
		System.out.println("大きい方の値は" + (a>b ? a:b) + "です。");
		
	}
}
