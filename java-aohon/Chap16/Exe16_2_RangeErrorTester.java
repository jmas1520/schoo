
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
		
		System.out.print("����a : ");
		int a = stdIn.nextInt();
		System.out.print("����b : ");
		int b = stdIn.nextInt();
		
		try {
			System.out.println("�����̘a��" + add(a,b) + "�ł��B");
		}
		catch(Exe16_2_RangeError e) {
			if(e instanceof Exe16_2_ParameterRangeError) {
				System.out.println("�����鐔���͈͊O�ł��B" + e.getMessage());
			}
			else if(e instanceof Exe16_2_ResultRangeError) {
				System.out.println("�v�Z���ʂ��͈͊O�ł��B" + e.toString());
			}
		}
	}
}
