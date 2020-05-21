
//演習4-25-2

import java.util.Scanner;

class Exe4_25_2{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数の合計および平均を算出します。");
        System.out.print("何個加算しますか：");
        int n = stdIn.nextInt(); 

        int sum = 0,ave = 0;
        for (int i = 1; i <= n; i++){
            System.out.print("整数：");
            int t = stdIn.nextInt(); 
            if(sum + t > 1000){
                n = i-1;
                System.out.println("合計が1,000を超えました。");
                System.out.println("最後の数値は無視します。");
                break;
            }

            sum += t;
        }

        ave = sum/n;
        System.out.println("合計は" + sum + "です。");
        System.out.println("平均は" + ave + "です。");
	}
}