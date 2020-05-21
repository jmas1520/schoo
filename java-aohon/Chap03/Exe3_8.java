
//‰‰K3-8

import java.util.Scanner;

class Exe3_8{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("‰½“_‚Å‚·‚©F");
		int n = stdIn.nextInt();
		
		
		if(0<=n && n<=59)
			System.out.println("•s‰Â");
		else if(60<=n && n<=69)
				System.out.println("‰Â");
		else if(70<=n && n<=79)
				System.out.println("—Ç");
		else if(80<=n && n<=100)
				System.out.println("—D");
		
	}
}
