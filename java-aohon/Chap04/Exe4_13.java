
//演習4-13

import java.util.Scanner;

class Exe4_13{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1からnまでの和を求めます。");

        int n = 0;
		for(int i = 0; i <= 0;){
			System.out.print("nの値：");
			n = stdIn.nextInt();
            i = n;
		} 

        int sum = 0;
		for(int i = 0; i <= n ; i++){
            sum += i;
		}

        System.out.println("1から"+ n + "までの和は"+ sum + "です。");
	}
}