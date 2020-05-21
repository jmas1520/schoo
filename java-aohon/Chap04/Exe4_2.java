
//演習4-2

import java.util.Scanner;
import java.util.Random;

class Exe4_2{
	public static void main (String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		int lucky = rand.nextInt(100)+10;

		System.out.print("10～99の数を当ててください。");

        int n;

		do{
			System.out.print("いくつですか：");
			n = stdIn.nextInt();

			if(n > lucky){
				System.out.println("もっと小さな数です。");
			}
			else if(n < lucky){
				System.out.println("もっと大きな数です。");
			}
		} while(n != lucky);

		System.out.println("正解です。");
	}
}