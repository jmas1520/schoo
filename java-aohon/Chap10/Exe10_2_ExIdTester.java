
import java.util.Scanner;

public class Exe10_2_ExIdTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int dis = 0,n = 0;
		
		Exe10_2_ExId a = new Exe10_2_ExId(dis,n);
		Exe10_2_ExId b = new Exe10_2_ExId(dis,n);
		
		System.out.println("a�̎��ʔԍ� �F " + a.getExId());
		System.out.println("b�̎��ʔԍ� �F " + b.getExId());
		
		do {
			System.out.print("�J�E���g��ύX���܂��� 1�E�E�EYes / 0�E�E�ENo �F ");
			dis = stdIn.nextInt();
			if(dis == 0) {
				break;
			}
		}while(dis != 1);
		
		if(dis == 1) {
			System.out.print("�J�E���g�l�͂����ɕύX���܂��� �F ");
			n = stdIn.nextInt();
		}
		
		Exe10_2_ExId c = new Exe10_2_ExId(dis,n);
		Exe10_2_ExId d = new Exe10_2_ExId(dis,n);
		
		System.out.println("c�̎��ʔԍ� �F " + c.getExId());
		System.out.println("d�̎��ʔԍ� �F " + d.getExId());
		
	}
}
