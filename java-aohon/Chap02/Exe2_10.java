
//演習2-10

import java.util.Scanner;

class Exe2_10{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("姓：");
		String s1 = stdIn.nextLine();
		
		System.out.print("名：");
		String s2 = stdIn.nextLine();
		
		
		System.out.println("こんにちは" + s1 + s2 + "さん。");
	}
}
