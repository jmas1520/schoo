
import java.util.Scanner;

public class Exe7_14 {
	
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
	
	static int set(int x,int pos,int n) {
		if((x & exp(pos)) != exp(pos)) {
			x = x | exp(pos);
		}
		int m = 2;
		for(int i = 1; i <= n; i++) {
			if((i + pos) == 31) {
				if((x & exp(pos)*-m) != exp(pos)*-m) {
					x = x | exp(pos)*-m;
				}
				break;
			}
			if((x & exp(pos)*m) != exp(pos)*m) {
				x = x | exp(pos)*m;
			}
			m *= 2;
		}
		return x;
	}
	
	static int reset(int x, int pos,int n) {
		if((x & exp(pos)) == exp(pos)) {
			x = x ^ exp(pos);
		}
		int m = 2;
		for(int i = 1; i <= n; i++) {
			if((i + pos) == 31) {
				if((x & exp(pos)*-m) == exp(pos)*-m) {
					x = x ^ exp(pos)*-m;
				}
				break;
			}
			if((x & exp(pos)*m) == exp(pos)*m) {
				x = x ^ exp(pos)*m;
			}
			m *= 2;
		}
		return x;
	}
	
	static int inverse(int x, int pos,int n) {
		if((x & exp(pos)) == exp(pos)) {
			x = x ^ exp(pos);
		}
		else {
			x = x | exp(pos);
		}
		int m = 2;
		for(int i = 1; i <= n; i++) {
			if((i + pos) == 31) {
				if((x & exp(pos)*-m) == exp(pos)*-m) {
					x = x ^ exp(pos)*-m;
				}
				else {
					x = x | exp(pos)*-m;
				}
				break;
			}
			if((x & exp(pos)*m) == exp(pos)*m) {
				x = x ^ exp(pos)*m;
			}
			else {
				x = x | exp(pos)*m;
			}
			m *= 2;
		}
		return x;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数 : ");
		int x = stdIn.nextInt();
		int pos,n;
		do {
			System.out.print("posの値 (0~31): ");
			pos = stdIn.nextInt();
		}while(pos < 0 || 31 < pos );
		do {
			System.out.print("nの値 : ");
			n = stdIn.nextInt();	
		}while(n < 0);
		
		
		System.out.print(" 　      整数 = ");
		printBits(x);
		System.out.print("\n 1にした値 = ");
		printBits(set(x,pos,n));
		System.out.print("\n 0にした値 = ");
		printBits(reset(x,pos,n));
		System.out.print("\n反転した値 = ");
		printBits(inverse(x,pos,n));
	}
}
