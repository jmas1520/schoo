
//���K2-7

import java.util.Random;

class Exe2_7{
	public static void main(String[] args){
		Random rand = new Random();
		
		int lucky1 = rand.nextInt(9) + 1;
		System.out.println("�����1���̐��̐����l��" + lucky1 + "�ł��B");
		
		int lucky2 = rand.nextInt(9) - 9;
		System.out.println("�����1���̕��̐����l��" + lucky2 + "�ł��B");
		
		int lucky3 = rand.nextInt(90) + 10;
		System.out.println("�����2���̐��̐����l��" + lucky3 + "�ł��B");
	}
}
