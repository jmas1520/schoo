
//���K3-15

import java.util.Scanner;

class Exe3_15{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����a�F");
		int a = stdIn.nextInt();
		
		System.out.print("����b�F");
		int b = stdIn.nextInt();
		
		
		if(b > a){
			int t = b;
			b = a;
			a = t;
		}
		
		System.out.println("a>=b�ƂȂ�悤�Ƀ\�[�g���܂����B");
		System.out.println("����a��" + a + "�ł��B");
		System.out.println("����b��" + b + "�ł��B");
		
	}
}
