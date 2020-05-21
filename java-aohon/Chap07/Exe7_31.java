
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
		
		System.out.print("intŒ^‚Ì’l : ");
		int in = stdIn.nextInt();
		System.out.print("longŒ^‚Ì’l : ");
		long l = stdIn.nextLong();
		System.out.print("floatŒ^‚Ì’l : ");
		float f = stdIn.nextFloat();
		System.out.print("doubleŒ^‚Ì’l : ");
		double d = stdIn.nextDouble();
		
		System.out.printf("intŒ^‚Ìâ‘Î’l‚Í%d‚Å‚·B\n",absolute(in));
		System.out.printf("longŒ^‚Ìâ‘Î’l‚Í%d‚Å‚·B\n",absolute(l));
		System.out.printf("floatŒ^‚Ìâ‘Î’l‚Í%f‚Å‚·B\n",absolute(f));
		System.out.printf("doubleŒ^‚Ìâ‘Î’l‚Í%f‚Å‚·B\n",absolute(d));
	}
}