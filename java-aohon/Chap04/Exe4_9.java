
//���K4-9

import java.util.Scanner;

class Exe4_9{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

        int n;
        do{
           System.out.print("n�̒l�F");
		   n = stdIn.nextInt();
        } while(n <= 0);

        int i = 1,pro = 1;
		while(i <= n){
			pro *= i;
            i ++; 
		}

        System.out.println("1����"+ n + "�܂ł̐ς�" + pro + "�ł��B");
	}
}