
//���K4-2

import java.util.Scanner;
import java.util.Random;

class Exe4_2{
	public static void main (String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		int lucky = rand.nextInt(100)+10;

		System.out.print("10�`99�̐��𓖂ĂĂ��������B");

        int n;

		do{
			System.out.print("�����ł����F");
			n = stdIn.nextInt();

			if(n > lucky){
				System.out.println("�����Ə����Ȑ��ł��B");
			}
			else if(n < lucky){
				System.out.println("�����Ƒ傫�Ȑ��ł��B");
			}
		} while(n != lucky);

		System.out.println("�����ł��B");
	}
}