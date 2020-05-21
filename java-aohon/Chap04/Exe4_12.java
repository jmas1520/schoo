
//演習4-12

import java.util.Scanner;

class Exe4_12{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("カウントアップします。");

        int x = 0;
		for(int i = 0; i <= 0;){
			System.out.print("正の整数値：");
			x = stdIn.nextInt();
            i = x;
		} 

		for(int i = 0; i <= x ; i++){
			System.out.println(i);
		}
	}
}