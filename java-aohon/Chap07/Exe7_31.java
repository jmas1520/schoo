
import java.util.Scanner;

public class Exe7_31 {
	
	static int absolute(int x) {
		return x < 0 ? -x : x;
	}
	
	static long absolute(long x) {
		return x < 0 ? -x : x;
	}

	static float absolute(float x) {
		return x < 0 ? -x : x;
	}

	static double absolute(double x) {
		return x < 0 ? -x : x;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("int�^�̒l : ");
		int in = stdIn.nextInt();
		System.out.print("long�^�̒l : ");
		long l = stdIn.nextLong();
		System.out.print("float�^�̒l : ");
		float f = stdIn.nextFloat();
		System.out.print("double�^�̒l : ");
		double d = stdIn.nextDouble();
		
		System.out.printf("int�^�̐�Βl��%d�ł��B\n",absolute(in));
		System.out.printf("long�^�̐�Βl��%d�ł��B\n",absolute(l));
		System.out.printf("float�^�̐�Βl��%f�ł��B\n",absolute(f));
		System.out.printf("double�^�̐�Βl��%f�ł��B\n",absolute(d));
	}
}