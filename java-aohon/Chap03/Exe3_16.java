
//���K3-16

import java.util.Scanner;

class Exe3_16{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����a�F");
		int a = stdIn.nextInt();
		
		System.out.print("����b�F");
		int b = stdIn.nextInt();
		
		System.out.print("����c�F");
		int c = stdIn.nextInt();
		
		int t;
		
		if(a > b){
			t = a;
			a = b;
			b = t;
		}
		if(b > c){
			t = b;
			b = c;
			c = t;
		}
		if(a > b){
			t = a;
			a = b;
			b = t;
		}
		
		
		System.out.println("a<=b<=c�ƂȂ�悤�Ƀ\�[�g���܂����B");
		System.out.println("����a��" + a + "�ł��B");
		System.out.println("����b��" + b + "�ł��B");
		System.out.println("����c��" + c + "�ł��B");
		
	}
}
