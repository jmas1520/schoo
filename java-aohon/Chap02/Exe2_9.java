
//���K2-9

import java.util.Random;

class Exe2_9{
	public static void main(String[] args){
		Random rand = new Random();
		
		double lucky1 = rand.nextDouble();
		System.out.println("0�ȏ�1.0�����̎����l�̗����𐶐����܂����B�����" + lucky1 + "�ł��B");
		
		double lucky2 = rand.nextDouble()* 10;
		System.out.println("0�ȏ�10.0�����̎����l�̗����𐶐����܂����B�����" + lucky2 + "�ł��B");
		
		double lucky3 = rand.nextDouble()* 2 - 1.0;
		System.out.println("-1.0�ȏ�1.0�����̎����l�̗����𐶐����܂����B�����" + lucky3 + "�ł��B");
	}
}
