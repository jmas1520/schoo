
//���K4-25-1

import java.util.Scanner;

class Exe4_25_1{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�����̍��v����ѕ��ς��Z�o���܂��B");
        System.out.print("�����Z���܂����F");
        int n = stdIn.nextInt(); 

        int sum = 0,ave = 0;
        for (int i = 1; i <= n; i++){
            System.out.print("�����i0�ŏI���j�F");
            int t = stdIn.nextInt(); 
            if(t == 0){
                n = i;
                break;
            }

            sum += t;
        }

        ave = sum/n;
        System.out.println("���v��" + sum + "�ł��B");
        System.out.println("���ς�" + ave + "�ł��B");
	}
}