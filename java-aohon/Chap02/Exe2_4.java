
//演習2-4

import java.util.Scanner;

class Exe2_4{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int x = stdIn.nextInt();
		int y = 10;
		
		System.out.println(y + "を加えた値は" + (x+y) + "です。");
		System.out.println(y + "を減じた値は" + (x-y) + "です。");
	}
}
