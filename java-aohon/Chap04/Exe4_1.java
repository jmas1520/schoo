
//���K4-1

import java.util.Scanner;

class Exe4_1{
	public static void main (String[] args){
		Scanner stdIn = new Scanner(System.in);

		int retry;

		do{
			System.out.print("�����l�F");
			int n = stdIn.nextInt();

			if(n > 0){
				System.out.println("���̒l�͐��ł��B");
			}
			else if(n < 0){
				System.out.println("���̒l�͕��ł��B");
			}
			else{
				System.out.println("���̒l��0�ł��B");
			}

			System.out.print("������x���肵�܂����@1�E�E�EYes/0�E�E�ENo �F");
			retry = stdIn.nextInt();
		} while(retry == 1);
	}
}