
import java.util.Scanner;

public class Exe7_12 {
	
	static void printBits(int x) {
		for(int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}
	
	static int rRotate(int x,int n) {
		for(int i = 0; i < n; i++) {
			if((x & 1) == 1) {
				x >>>= 1;
				x = x | -2147483648;
			}
			else{
				x >>>= 1;
			}
		}
		return x;
	}
	
	static int lRotate(int x, int n) {
		for(int i = 0; i < n; i++) {
			if((x & -2147483648) == -2147483648) {
				x <<= 1;
				x = x | 1;
			}
			else{
				x <<= 1;
			}
		}
		return x;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("®” : ");
		int x = stdIn.nextInt();
		System.out.print("‰ñ“]‚·‚éƒrƒbƒg” : ");
		int n = stdIn.nextInt();
		
		System.out.print("®@” = ");
		printBits(x);
		System.out.print("\n‰E‰ñ“] = ");
		printBits(rRotate(x,n));
		System.out.print("\n¶‰ñ“] = ");
		printBits(lRotate(x,n));
	
	}

}