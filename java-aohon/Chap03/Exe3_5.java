
//���K3-5

import java.util.Scanner;

class Exe3_5{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���̐����l�F");
		int n = stdIn.nextInt();
		
		if(n > 0)
			if(n%5 == 0)
				System.out.println("���̒l��5�Ŋ���؂�܂��B");
			else 
				System.out.println("���̒l��5�Ŋ���؂�܂���B");
		else 
			System.out.println("���łȂ��l�����͂���܂����B");
	}
}
