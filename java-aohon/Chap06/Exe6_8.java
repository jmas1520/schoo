
//���K6-8

import java.util.Scanner;

class Exe6_8{
	public static void main (String[] args){
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("�v�f���F");
        int n = stdIn.nextInt();
        double[]  a = new double[n];

        for(int i = 0; i < a.length; i++){
            System.out.printf("a[%d]�F",i);
            a[i] = stdIn.nextDouble();
        }

        double sum = 0;
        for(double j : a){
            sum += j;
        }

        double ave = sum / n;

        System.out.printf("�S�v�f�̍��v��%.3f�ł��B\n���ς�%.3f�ł��B\n",sum,ave);

	}
}