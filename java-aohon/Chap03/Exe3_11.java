
//���K3-11

import java.util.Scanner;

class Exe3_11{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����A�F");
		int a = stdIn.nextInt();
		
		System.out.print("����B�F");
		int b = stdIn.nextInt();
		
		if(a-b >= 0)
			System.out.println("�����̍���" + (a-b <= 10 ? "10�ȉ�":"11�ȏ�") + "�ł��B");
		else
			System.out.println("�����̍���" + (b-a <= 10 ? "10�ȉ�":"11�ȏ�") + "�ł��B");
	}
}
