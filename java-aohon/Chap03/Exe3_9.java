
//���K3-9

import java.util.Scanner;

class Exe3_9{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����a�F");
		double a = stdIn.nextDouble();
		
		System.out.print("����b�F");
		double b = stdIn.nextDouble();
		
		System.out.println("�傫�����̒l��" + (a>b ? a:b) + "�ł��B");
		
	}
}
