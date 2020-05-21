
//‰‰K4-20

import java.util.Scanner;

class Exe4_20{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("’i”‚ÍF");
        int n = stdIn.nextInt();

		for(int i = 1; i <= n; i++){ 
            for(int j = 1; j <= n; j++){
                System.out.print('–');
            }
            System.out.println();
		}

	}
}