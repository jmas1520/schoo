
//演習4-15

import java.util.Scanner;

class Exe4_15{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("何cmから：");
        int start = stdIn.nextInt();

        System.out.print("何cmまで：");
        int end = stdIn.nextInt();

        System.out.print("何cmごと：");
        int inter = stdIn.nextInt();

        System.out.println("身長　標準体重");

		for(int i = inter; start <= end ; i++){ 

            System.out.println(start + "　　" + (double)(start-100)*0.9);

            start += inter;
		}
	}
}