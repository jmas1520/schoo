//���K5-1

import java.util.Scanner;

class Exe5_1{
	public static void main (String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("10�i����8,16�i���ɕϊ����܂��B");
		System.out.print("10�i������͂��Ă��������F");
		int n = stdIn.nextInt();

		System.out.printf("8�i���� %o �ł��B\n",n);
		System.out.printf("16�i���� %x �ł��B" ,n);

	}
}