
//���K3-4

import java.util.Scanner;

class Exe3_4{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����a�F");
		int a = stdIn.nextInt();
		
		System.out.print("����b�F");
		int b = stdIn.nextInt();
		
		if(a > b)
			System.out.println("a�̕����傫���ł��B");
		else if(a == b)
			System.out.println("a��b�͓����l�ł��B");
		else 
			System.out.println("b�̕����傫���ł��B");
	}
}

