
//演習4-9

import java.util.Scanner;

class Exe4_9{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

        int n;
        do{
           System.out.print("nの値：");
		   n = stdIn.nextInt();
        } while(n <= 0);

        int i = 1,pro = 1;
		while(i <= n){
			pro *= i;
            i ++; 
		}

        System.out.println("1から"+ n + "までの積は" + pro + "です。");
	}
}