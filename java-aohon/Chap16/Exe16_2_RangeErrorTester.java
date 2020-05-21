
import java.util.Scanner;

public class Exe16_2_RangeErrorTester {
	
	static boolean isValid(int n) {
		return n >= 0 && n <= 9;
	}
	
	static int add(int a,int b) {
		if(!isValid(a)) throw new Exe16_2_ParameterRangeError(a);
		if(!isValid(b)) throw new Exe16_2_ParameterRangeError(b);
		
		int result = a + b;
		if(!isValid(result)) throw new Exe16_2_ResultRangeError(result);
		return result;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a : ");
		int a = stdIn.nextInt();
		System.out.print("整数b : ");
		int b = stdIn.nextInt();
		
		try {
			System.out.println("それらの和は" + add(a,b) + "です。");
		}
		catch(Exe16_2_RangeError e) {
			if(e instanceof Exe16_2_ParameterRangeError) {
				System.out.println("加える数が範囲外です。" + e.getMessage());
			}
			else if(e instanceof Exe16_2_ResultRangeError) {
				System.out.println("計算結果が範囲外です。" + e.toString());
			}
		}
	}
}
