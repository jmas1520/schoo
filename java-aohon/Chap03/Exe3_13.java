
//���K3-13

import java.util.Scanner;

class Exe3_13{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����A�F");
		int a = stdIn.nextInt();
		
		System.out.print("����B�F");
		int b = stdIn.nextInt();
		
		System.out.print("����C�F");
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
		
		int medi = b;
		
		System.out.println("�����l��" + medi + "�ł��B");
	}
}
