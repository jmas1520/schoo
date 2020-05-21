
//演習3-11

import java.util.Scanner;

class Exe3_11{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数A：");
		int a = stdIn.nextInt();
		
		System.out.print("整数B：");
		int b = stdIn.nextInt();
		
		if(a-b >= 0)
			System.out.println("それらの差は" + (a-b <= 10 ? "10以下":"11以上") + "です。");
		else
			System.out.println("それらの差は" + (b-a <= 10 ? "10以下":"11以上") + "です。");
	}
}
