
//演習3-15

import java.util.Scanner;

class Exe3_15{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a：");
		int a = stdIn.nextInt();
		
		System.out.print("整数b：");
		int b = stdIn.nextInt();
		
		
		if(b > a){
			int t = b;
			b = a;
			a = t;
		}
		
		System.out.println("a>=bとなるようにソートしました。");
		System.out.println("整数aは" + a + "です。");
		System.out.println("整数bは" + b + "です。");
		
	}
}
