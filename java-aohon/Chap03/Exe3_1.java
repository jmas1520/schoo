
//���K3-1

import java.util.Scanner;

class Exe3_1{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int s = stdIn.nextInt();
		
		if(s >= 0)
			System.out.println("���̐�Βl��" + s + "�ł��B");
		else
			System.out.println("���̐�Βl��" + (-s) + "�ł��B");
	}
}
