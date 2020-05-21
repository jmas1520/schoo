
//演習5-5

import java.util.Scanner;

class Exe5_5{
	public static void main (String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("xの値：");
		int x = stdIn.nextInt();

        System.out.print("yの値：");
		int y = stdIn.nextInt();

        System.out.print("zの値：");
		int z = stdIn.nextInt();

        int sum = x + y + z;
        double ave = (double)sum / 3;

        System.out.println("合計は" + sum + "です。");
        System.out.println("平均は" + ave + "です。");

	}
}