
//演習3-4

import java.util.Scanner;

class Exe3_4{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a：");
		int a = stdIn.nextInt();
		
		System.out.print("整数b：");
		int b = stdIn.nextInt();
		
		if(a > b)
			System.out.println("aの方が大きいです。");
		else if(a == b)
			System.out.println("aとbは同じ値です。");
		else 
			System.out.println("bの方が大きいです。");
	}
}

