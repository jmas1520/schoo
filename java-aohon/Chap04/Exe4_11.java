
//演習4-11

import java.util.Scanner;

class Exe4_11{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("カウントダウンします。");

        int x = 0;
		for(int i = 0; i <= 0;){
			System.out.print("正の整数値：");
			x = stdIn.nextInt();
            i = x;
		} 

		for(int i = 0; x-i >= 0 ; i++){
			System.out.println(x-i);
		}
	}
}