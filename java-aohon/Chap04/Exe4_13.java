
//‰‰K4-13

import java.util.Scanner;

class Exe4_13{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1‚©‚çn‚Ü‚Å‚Ì˜a‚ğ‹‚ß‚Ü‚·B");

        int n = 0;
		for(int i = 0; i <= 0;){
			System.out.print("n‚Ì’lF");
			n = stdIn.nextInt();
            i = n;
		} 

        int sum = 0;
		for(int i = 0; i <= n ; i++){
            sum += i;
		}

        System.out.println("1‚©‚ç"+ n + "‚Ü‚Å‚Ì˜a‚Í"+ sum + "‚Å‚·B");
	}
}