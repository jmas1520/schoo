
//���K3-18

import java.util.Scanner;

class Exe3_18{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����ł����F");
		int month = stdIn.nextInt();
		
		if(3 <= month && month <= 5){
			System.out.print("�t�ł��B");
		}
		else if(6 <= month && month <= 8){
			System.out.print("�Ăł��B");
		}
		else if(9 <= month && month <= 11){
			System.out.print("�H�ł��B");
		}
		else if(month == 12 || month == 1 || month == 2){
			System.out.print("�~�ł��B");
		}
	}
}
