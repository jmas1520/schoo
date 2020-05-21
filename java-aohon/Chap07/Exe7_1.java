
import java.util.Scanner;

public class Exe7_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("n‚Ì’lF");
		int n = stdIn.nextInt();
		System.out.println(signOf(n));

	}
	
	static int signOf(int n) {
		if(n < 0) {
			return -1;
		}
		else if(n > 0) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
