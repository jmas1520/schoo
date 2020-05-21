
import java.util.Scanner;

public class Exe7_4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("n‚Ì’lF");
		int n = stdIn.nextInt();
		
		System.out.println("‘˜a‚Í" + sumUp(n) + "‚Å‚·");

	}
	
	static int sumUp(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		
		
		return sum;
	}

}