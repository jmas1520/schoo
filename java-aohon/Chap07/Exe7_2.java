
import java.util.Scanner;

public class Exe7_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("a�̒l�F");
		int a = stdIn.nextInt();
		System.out.print("b�̒l�F");
		int b = stdIn.nextInt();
		System.out.print("c�̒l�F");
		int c = stdIn.nextInt();
		
		System.out.println("�ŏ��l��" + min(a,b,c) + "�ł�");

	}
	
	static int min(int a,int b, int c) {
		int min = a;
		if(b < min) {
			min = b;
		}
		else if(c < min) {
			min = c;
		}
		return min;
	}

}