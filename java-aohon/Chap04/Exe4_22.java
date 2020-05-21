
//‰‰K4-22

import java.util.Scanner;

class Exe4_22{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("’i”‚ÍF");
        int n = stdIn.nextInt();

		for(int i = 1; i <= n; i++){ 

            int m = (i-1)*2+1;

            for(int k = 1; k <= n-i; k++){
                    System.out.print('@');
            }

            for(int j = 1; j <= m; j++){
                System.out.print('–');
            }
            System.out.println();
		}

	}
}