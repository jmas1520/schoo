
//���K4-8

import java.util.Scanner;

class Exe4_8{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
        
        int n;
        do{
           System.out.print("���̐����l�F");
		   n = stdIn.nextInt();
        } while(n <= 0);

        int sum = 0;
		while(n > 0){
			n /= 10;
            sum ++; 
		}

        System.out.println("���̒l��"+ sum + "���ł��B");
	}
}