
//���K3-10

import java.util.Scanner;

class Exe3_10{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����a�F");
		int a = stdIn.nextInt();
		
		System.out.print("����b�F");
		int b = stdIn.nextInt();
		
		System.out.println("�����̍���" + (a>b ? a-b:b-a) + "�ł��B"); //�������ɂȂ�悤�ɕ\��
		
	}
}
