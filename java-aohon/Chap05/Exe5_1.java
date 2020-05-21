//演習5-1

import java.util.Scanner;

class Exe5_1{
	public static void main (String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("10進数を8,16進数に変換します。");
		System.out.print("10進数を入力してください：");
		int n = stdIn.nextInt();

		System.out.printf("8進数は %o です。\n",n);
		System.out.printf("16進数は %x です。" ,n);

	}
}