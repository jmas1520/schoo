
//演習3-1

import java.util.Scanner;

class Exe3_1{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int s = stdIn.nextInt();
		
		if(s >= 0)
			System.out.println("その絶対値は" + s + "です。");
		else
			System.out.println("その絶対値は" + (-s) + "です。");
	}
}
