
import java.util.Scanner;
import java.util.Random;

public class Exe7_8 {
	
	static int Random(int a,int b) {
		Random rand = new Random();
		int luck = rand.nextInt(b-a)+a;
		return luck;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);		
		
		System.out.print("a�̒l�F");
		int a = stdIn.nextInt();
		System.out.print("b�̒l�F");
		int b = stdIn.nextInt();
		
		System.out.printf("%d�ȏ�%d�ȉ��̗�����%d�ł��B",a,b,Random(a,b));

	}

}