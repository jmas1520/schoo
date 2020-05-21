
import java.util.Scanner;

public class Exe7_13 {
	
	static void printBits(int x) {
		for(int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}
	
	static int exp(int pos) {
		int exp = 1;
		if(pos == 31) {
			for(int i = 0; i < pos; i++) {
				exp *= -2;
			}
			return exp;
		}
		else {
			for(int i = 0; i < pos; i++) {
				exp *= 2;
			}
			return exp;
		}
	}
	
	static int set(int x,int pos) {
		if((x & exp(pos)) != exp(pos)) {
			x = x | exp(pos);
		}
		return x;
	}
	
	static int reset(int x, int pos) {
		if((x & exp(pos)) == exp(pos)) {
			x = x ^ exp(pos);
		}
		return x;
	}
	
	static int inverse(int x, int pos) {
		if((x & exp(pos)) == exp(pos)) {
			x = x ^ exp(pos);
		}
		else {
			x = x | exp(pos);
		}
		return x;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数 : ");
		int x = stdIn.nextInt();
		int pos;
		do {
			System.out.print("posの値 (0~31): ");
			pos = stdIn.nextInt();
		}while(pos < 0 || 31 < pos );
		
		System.out.print("     　　　　　　　　　 整数 = ");
		printBits(x);
		System.out.print("\n posビット目を1にした値 = ");
		printBits(set(x,pos));
		System.out.print("\n posビット目を0にした値 = ");
		printBits(reset(x,pos));
		System.out.print("\nposビット目を反転した値 = ");
		printBits(inverse(x,pos));
	}
}