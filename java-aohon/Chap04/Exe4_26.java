
//���K4-26

import java.util.Scanner;

class Exe4_26{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�����̍��v����ѕ��ς��Z�o���܂��B");
        System.out.print("�����Z���܂����F");
        int n = stdIn.nextInt(); 

        int sum = 0,ave = 0;
        for (int i = 1; i <= n; i++){
            System.out.print("�����F");
            int t = stdIn.nextInt(); 
            if(t < 0){
                n = i-1;
                System.out.println("���̐��͉��Z���܂���B");
                continue;
            }

            sum += t;
        }

        ave = sum/n;
        System.out.println("���v��" + sum + "�ł��B");
        System.out.println("���ς�" + ave + "�ł��B");
	}
}