
//‰‰K3-18

import java.util.Scanner;

class Exe3_18{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("‰½Œ‚Å‚·‚©F");
		int month = stdIn.nextInt();
		
		if(3 <= month && month <= 5){
			System.out.print("t‚Å‚·B");
		}
		else if(6 <= month && month <= 8){
			System.out.print("‰Ä‚Å‚·B");
		}
		else if(9 <= month && month <= 11){
			System.out.print("H‚Å‚·B");
		}
		else if(month == 12 || month == 1 || month == 2){
			System.out.print("“~‚Å‚·B");
		}
	}
}
