
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
		
		System.out.print("���� : ");
		int x = stdIn.nextInt();
		int pos;
		do {
			System.out.print("pos�̒l (0~31): ");
			pos = stdIn.nextInt();
		}while(pos < 0 || 31 < pos );
		
		System.out.print("     �@�@�@�@�@�@�@�@�@ ���� = ");
		printBits(x);
		System.out.print("\n pos�r�b�g�ڂ�1�ɂ����l = ");
		printBits(set(x,pos));
		System.out.print("\n pos�r�b�g�ڂ�0�ɂ����l = ");
		printBits(reset(x,pos));
		System.out.print("\npos�r�b�g�ڂ𔽓]�����l = ");
		printBits(inverse(x,pos));
	}
}