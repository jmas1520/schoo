
import java.util.Scanner;

public class Exe7_6 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("m‚Ì’lF");
		int m = stdIn.nextInt();
		
		printSeason(m);

	}
	
	static void printSeason(int m) {
		if(3 <= m && m <= 5) {
			System.out.println("t");
		}
		else if(6 <= m && m <= 8) {
			System.out.println("‰Ä");
		}
		else if(9 <= m && m <= 11) {
			System.out.println("H");
		}
		else if(m == 12 || m == 1 || m == 2) {
			System.out.println("“~");
		}
		else {
			System.out.println();
		}
		
	}

}