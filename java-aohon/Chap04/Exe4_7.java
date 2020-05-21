
//‰‰K4-7

import java.util.Scanner;

class Exe4_7{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("‰½ŒÂ•\¦‚µ‚Ü‚·‚©F");
		int n = stdIn.nextInt();

        int i = 1;
		while(i <= n){
			if(i%2 == 0){
				System.out.print('{');
			}
			else{
				System.out.print('–');
			}
            i++;
		}
	}
}