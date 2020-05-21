
//‰‰K4-21_1(’¼Šp‚ª¶ã)

import java.util.Scanner;

class Exe4_21_1{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("’i”‚ÍF");
        int n = stdIn.nextInt();

		for(int i = 1; i <= n; i++){ 
            for(int j = n; j >= i; j--){
                System.out.print('–');
            }
            System.out.println();
		}

	}
}