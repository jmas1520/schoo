
//���K3-14

import java.util.Scanner;

class Exe3_14{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����a�F");
		int a = stdIn.nextInt();
		
		System.out.print("����b�F");
		int b = stdIn.nextInt();
		
		if(a == b){
			System.out.println("��̒l�͓����ł��B");
		}
		
		int min,max;
		
		if(a > b){
			max = a;
			min = b;
			System.out.println("�傫�����̒l��" + max + "�ł��B");
			System.out.println("���������̒l��" + min + "�ł��B");
		}
		else if(b > a){
			max = b;
			min = a;
			System.out.println("�傫�����̒l��" + max + "�ł��B");
			System.out.println("���������̒l��" + min + "�ł��B");
		}
	}
}
