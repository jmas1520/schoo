
//演習3-10

import java.util.Scanner;

class Exe3_10{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a：");
		int a = stdIn.nextInt();
		
		System.out.print("整数b：");
		int b = stdIn.nextInt();
		
		System.out.println("これらの差は" + (a>b ? a-b:b-a) + "です。"); //差が正になるように表示
		
	}
}
