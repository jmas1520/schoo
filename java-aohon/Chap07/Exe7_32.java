
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
		
		System.out.print("byte�^�̒l : ");
		byte b = stdIn.nextByte();
		System.out.print("short�^�̒l : ");
		short s = stdIn.nextShort();
		System.out.print("int�^�̒l : ");
		int in = stdIn.nextInt();
		System.out.print("long�^�̒l : ");
		long l = stdIn.nextLong();
		
		System.out.print("byte�^�̒l = ");
		printBits(b);
		System.out.print("\nshort�^�̒l = ");
		printBits(s);
		System.out.print("\nint�^�̒l = ");
		printBits(in);
		System.out.print("\nlong�^�̒l = ");
		printBits(l);
		
	}
}