
//演習4-27

import java.util.Scanner;
import java.util.Random;

class Exe4_27{
	public static void main (String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		int no = rand.nextInt(100);

        System.out.println("数当てゲーム開始！");
		System.out.println("0～99の数をn回以内に当ててください。");

        System.out.print("nの値は：");
		int n = stdIn.nextInt();

        int x;
		for(int i = 0; i <= n; i++){
			if(i == n){
				System.out.println("正解は" + no + "でした。。。");
				break;
			}
			System.out.print("いくつかな：");
			x = stdIn.nextInt();

			if(x > no){
				System.out.println("もっと小さな数です。");
			}
			else if(x < no){
				System.out.println("もっと大きな数です。");
			}
            else{
                System.out.println("正解です。");
				break;
            }
		}
	}
}