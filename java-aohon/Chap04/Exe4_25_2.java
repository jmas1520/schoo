
//���K4-25-2

import java.util.Scanner;

class Exe4_25_2{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�����̍��v����ѕ��ς��Z�o���܂��B");
        System.out.print("�����Z���܂����F");
        int n = stdIn.nextInt(); 

        int sum = 0,ave = 0;
        for (int i = 1; i <= n; i++){
            System.out.print("�����F");
            int t = stdIn.nextInt(); 
            if(sum + t > 1000){
                n = i-1;
                System.out.println("���v��1,000�𒴂��܂����B");
                System.out.println("�Ō�̐��l�͖������܂��B");
                break;
            }

            sum += t;
        }

        ave = sum/n;
        System.out.println("���v��" + sum + "�ł��B");
        System.out.println("���ς�" + ave + "�ł��B");
	}
}