
//演習3-17

import java.util.Random;

class Exe3_17{
	public static void main(String[] args){
		Random rand = new Random();
		
		int hand = rand.nextInt(3);
		
		
	switch(hand){
		case 0: System.out.print("グー");
				break;
		case 1: System.out.print("チョキ");
				break;
		case 2: System.out.print("パー");
				break;
	}
	}
}
