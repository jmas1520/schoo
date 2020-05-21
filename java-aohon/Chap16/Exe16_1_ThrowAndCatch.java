
import java.util.Scanner;

class Exe16_1_ThrowAndCatch {
	
	static void check(int sw) throws Exception{
		switch(sw) {
		case 1: throw new Exception("������O����");
		case 2: throw new RuntimeException("�񌟍���O����");
		}
	}
	
	static void test(int sw) throws Exception{
		check(sw);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("sw �F ");
		int sw = stdIn.nextInt();
		
		try {
			test(sw);
		}
		catch(RuntimeException e) {
			System.out.println("��O"+ sw + "��ߑ�");
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("��O"+ sw + "��ߑ����܂����B");
			System.out.println(e.getMessage());
		}
	}
}
