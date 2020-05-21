
import java.util.Scanner;

class Exe16_1_ThrowAndCatch {
	
	static void check(int sw) throws Exception{
		switch(sw) {
		case 1: throw new Exception("検査例外発生");
		case 2: throw new RuntimeException("非検査例外発生");
		}
	}
	
	static void test(int sw) throws Exception{
		check(sw);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("sw ： ");
		int sw = stdIn.nextInt();
		
		try {
			test(sw);
		}
		catch(RuntimeException e) {
			System.out.println("例外"+ sw + "を捕捉");
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("例外"+ sw + "を捕捉しました。");
			System.out.println(e.getMessage());
		}
	}
}
