
//���K4-15

import java.util.Scanner;

class Exe4_15{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("��cm����F");
        int start = stdIn.nextInt();

        System.out.print("��cm�܂ŁF");
        int end = stdIn.nextInt();

        System.out.print("��cm���ƁF");
        int inter = stdIn.nextInt();

        System.out.println("�g���@�W���̏d");

		for(int i = inter; start <= end ; i++){ 

            System.out.println(start + "�@�@" + (double)(start-100)*0.9);

            start += inter;
		}
	}
}