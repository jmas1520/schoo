
//演習4-14

import java.util.Scanner;

class Exe4_14{
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
		for(int i = 1; i <= n ; i++){
            sum += i;
            if(i < n){
                System.out.print(i + " + ");
            }

            else if(i == n){
                System.out.print(i + " = " + sum); 
            }
		}
	}
}