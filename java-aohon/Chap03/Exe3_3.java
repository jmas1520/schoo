
//���K3-3

import java.util.Scanner;

class Exe3_3{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int n = stdIn.nextInt();
		
		if(n > 0)
			System.out.println("���̒l�͐��ł��B");
		else if(n < 0)
			System.out.println("���̒l�͕��ł��B");
		else if(n == 0)
			System.out.println("���̒l��0�ł��B");
	}
}


/*
���Ȃ��������A���̏ꍇ��else�̕����Ȍ��ł悢�B
*/


