
//演習4-26

import java.util.Scanner;

class Exe4_26{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数の合計および平均を算出します。");
        System.out.print("何個加算しますか：");
        int n = stdIn.nextInt(); 

        int sum = 0,ave = 0;
        for (int i = 1; i <= n; i++){
            System.out.print("整数：");
            int t = stdIn.nextInt(); 
            if(t < 0){
                n = i-1;
                System.out.println("負の数は加算しません。");
                continue;
            }

            sum += t;
        }

        ave = sum/n;
        System.out.println("合計は" + sum + "です。");
        System.out.println("平均は" + ave + "です。");
	}
}