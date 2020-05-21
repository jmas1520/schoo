
//‰‰K4-3

import java.util.Scanner;

class Exe4_3{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("®”AF");
		int a = stdIn.nextInt();
		
		System.out.print("®”BF");
		int b = stdIn.nextInt();

		int i = -1;

		do{
            i++;                

			if(a > b){
				System.out.print((b+i) + " ");
			}
			else if(b > a){
				System.out.print((a+i) + " ");
			}
            else{
                System.out.print(a);
            }
		} while(a != (b+i) && b != (a+i) && a != b);
	}
}
