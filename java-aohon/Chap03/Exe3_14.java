
//演習3-14

import java.util.Scanner;

class Exe3_14{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a：");
		int a = stdIn.nextInt();
		
		System.out.print("整数b：");
		int b = stdIn.nextInt();
		
		if(a == b){
			System.out.println("二つの値は同じです。");
		}
		
		int min,max;
		
		if(a > b){
			max = a;
			min = b;
			System.out.println("大きい方の値は" + max + "です。");
			System.out.println("小さい方の値は" + min + "です。");
		}
		else if(b > a){
			max = b;
			min = a;
			System.out.println("大きい方の値は" + max + "です。");
			System.out.println("小さい方の値は" + min + "です。");
		}
	}
}
