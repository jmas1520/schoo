
//���K4-27

import java.util.Scanner;
import java.util.Random;

class Exe4_27{
	public static void main (String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		int no = rand.nextInt(100);

        System.out.println("�����ăQ�[���J�n�I");
		System.out.println("0�`99�̐���n��ȓ��ɓ��ĂĂ��������B");

        System.out.print("n�̒l�́F");
		int n = stdIn.nextInt();

        int x;
		for(int i = 0; i <= n; i++){
			if(i == n){
				System.out.println("������" + no + "�ł����B�B�B");
				break;
			}
			System.out.print("�������ȁF");
			x = stdIn.nextInt();

			if(x > no){
				System.out.println("�����Ə����Ȑ��ł��B");
			}
			else if(x < no){
				System.out.println("�����Ƒ傫�Ȑ��ł��B");
			}
            else{
                System.out.println("�����ł��B");
				break;
            }
		}
	}
}