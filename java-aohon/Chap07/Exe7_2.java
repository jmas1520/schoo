
import java.util.Scanner;

public class Exe7_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("aの値：");
		int a = stdIn.nextInt();
		System.out.print("bの値：");
		int b = stdIn.nextInt();
		System.out.print("cの値：");
		int c = stdIn.nextInt();
		
		System.out.println("最小値は" + min(a,b,c) + "です");

	}
	
	static int min(int a,int b, int c) {
		int min = a;
		if(b < min) {
			min = b;
		}
		else if(c < min) {
			min = c;
		}
		return min;
	}

}