
//���K3-12

import java.util.Scanner;

class Exe3_12{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����A�F");
		int a = stdIn.nextInt();
		
		System.out.print("����B�F");
		int b = stdIn.nextInt();
		
		System.out.print("����C�F");
		int c = stdIn.nextInt();
		
		int min = a;
		
		if(b < min) min = b;
		
		if(c < min) min = c;
		
		System.out.println("�ŏ��l��" + min + "�ł��B");
	}
}
