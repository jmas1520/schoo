
//演習3-16

import java.util.Scanner;

class Exe3_16{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a：");
		int a = stdIn.nextInt();
		
		System.out.print("整数b：");
		int b = stdIn.nextInt();
		
		System.out.print("整数c：");
		int c = stdIn.nextInt();
		
		int t;
		
		if(a > b){
			t = a;
			a = b;
			b = t;
		}
		if(b > c){
			t = b;
			b = c;
			c = t;
		}
		if(a > b){
			t = a;
			a = b;
			b = t;
		}
		
		
		System.out.println("a<=b<=cとなるようにソートしました。");
		System.out.println("整数aは" + a + "です。");
		System.out.println("整数bは" + b + "です。");
		System.out.println("整数cは" + c + "です。");
		
	}
}
