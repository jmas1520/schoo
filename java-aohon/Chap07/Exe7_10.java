
import java.util.Scanner;
import java.util.Random;

public class Exe7_10 {
	
	static Scanner stdIn = new Scanner(System.in);
	
	static boolean confirmRetry() {
		int cont;
		do {
			System.out.print("もう一度？<Yes・・・1 / No・・・0>");
			cont = stdIn.nextInt();
		}while(cont != 0 && cont != 1);
		return cont == 1;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println("暗算力トレーニング!!");
		do {
			int x = rand.nextInt(900) + 100;
			int y = rand.nextInt(900) + 100;
			int z = rand.nextInt(900) + 100;
			char[] ope = {'+','-'};
			int i = rand.nextInt(2),j = rand.nextInt(2);
			
			while(true) {
				System.out.printf("%d %c %d %c %d = ",x,ope[i],y,ope[j],z);
				int k = stdIn.nextInt();
				if(i == 0 && j == 0 && k == x + y + z) {
					break;
				}
				else if(i == 0 && j == 1 && k == x + y - z) {
					break;
				}
				else if(i == 1 && j == 0 && k == x - y + z) {
					break;
				}
				else if(i == 1 && j == 1 && k == x - y - z) {
					break;
				}
				System.out.println("違いますよ!!");
			}
		}while(confirmRetry());

	}

}