
//‰‰K4-6-2

import java.util.Scanner;

class Exe4_6_2{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("‰½ŒÂ–‚ğ•\¦‚µ‚Ü‚·‚©F");
		int n = stdIn.nextInt();

        int i = 1;
		while(i <= n){
			System.out.print('–');
            i++;
		}

        if(n > 0){
            System.out.println();
        }
	}
}