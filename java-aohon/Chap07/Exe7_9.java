
import java.util.Scanner;

public class Exe7_9 {
	
	static int readPlusInt() {
		Scanner stdIn = new Scanner(System.in);
		int n = 0;
		do {
			System.out.print("正の整数値：");
			n = stdIn.nextInt();
		}while(n <= 0);
		return n;
	}
	
	public static void main(String[] args) {	
		readPlusInt();

	}

}