
//演習6-8

import java.util.Scanner;

class Exe6_8{
	public static void main (String[] args){
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("要素数：");
        int n = stdIn.nextInt();
        double[]  a = new double[n];

        for(int i = 0; i < a.length; i++){
            System.out.printf("a[%d]：",i);
            a[i] = stdIn.nextDouble();
        }

        double sum = 0;
        for(double j : a){
            sum += j;
        }

        double ave = sum / n;

        System.out.printf("全要素の合計は%.3fです。\n平均は%.3fです。\n",sum,ave);

	}
}