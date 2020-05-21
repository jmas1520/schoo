
//‰‰K4-16

import java.util.Scanner;

class Exe4_16{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("‰½ŒÂ–‚ğ•\¦‚µ‚Ü‚·‚©F");
        int n = stdIn.nextInt();

		for(int i = 1; i <= n ; i++){ 

            System.out.print('–');

            if(i%5 == 0){
                System.out.println();
            }

		}

        System.out.println();
	}
}