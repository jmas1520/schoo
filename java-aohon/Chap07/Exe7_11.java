
import java.util.Scanner;

public class Exe7_11 {
	
	static void printBits(int x) {
		for(int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� :�@");
		int x = stdIn.nextInt();
		System.out.print("�V�t�g����r�b�g������тׂ���̐� :�@");
		int n = stdIn.nextInt();
		int exp = 1;
		for(int i = 0; i < n; i++) {
			exp *= 2;
		}
		int multi = x * exp,div = x / exp;
		
		System.out.print("���� = ");
		printBits(x);
		System.out.print("\nx << n  = ");
		printBits(x << n);
		System.out.print("\nx * 2^n = ");
		printBits(multi);
		System.out.print("\nx >> n  = ");
		printBits(x >> n);
		System.out.print("\nx / 2^n = ");
		printBits(div);
		

	}

}