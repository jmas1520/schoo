
import java.util.Scanner;

public class Exe7_32 {
	
	static void printBits(byte x) {
		for(int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}
	
	static void printBits(short x) {
		for(int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}

	static void printBits(int x) {
		for(int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}

	static void printBits(long x) {
		for(int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("byteŒ^‚Ì’l : ");
		byte b = stdIn.nextByte();
		System.out.print("shortŒ^‚Ì’l : ");
		short s = stdIn.nextShort();
		System.out.print("intŒ^‚Ì’l : ");
		int in = stdIn.nextInt();
		System.out.print("longŒ^‚Ì’l : ");
		long l = stdIn.nextLong();
		
		System.out.print("byteŒ^‚Ì’l = ");
		printBits(b);
		System.out.print("\nshortŒ^‚Ì’l = ");
		printBits(s);
		System.out.print("\nintŒ^‚Ì’l = ");
		printBits(in);
		System.out.print("\nlongŒ^‚Ì’l = ");
		printBits(l);
		
	}
}