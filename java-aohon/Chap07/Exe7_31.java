
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
		
		System.out.print("int型の値 : ");
		int in = stdIn.nextInt();
		System.out.print("long型の値 : ");
		long l = stdIn.nextLong();
		System.out.print("float型の値 : ");
		float f = stdIn.nextFloat();
		System.out.print("double型の値 : ");
		double d = stdIn.nextDouble();
		
		System.out.printf("int型の絶対値は%dです。\n",absolute(in));
		System.out.printf("long型の絶対値は%dです。\n",absolute(l));
		System.out.printf("float型の絶対値は%fです。\n",absolute(f));
		System.out.printf("double型の絶対値は%fです。\n",absolute(d));
	}
}