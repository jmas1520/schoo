
import java.util.Scanner;

public class Exe8_2_CarTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�Ԃ̃f�[�^����͂��Ă������B");
		System.out.print("���O �F ");
		String name = stdIn.next();
		System.out.print("�i���o�[�i��E��-�S-20�j �F ");
		String number = stdIn.next();
		System.out.print("�ԕ�(mm) �F ");
		int width = stdIn.nextInt();
		System.out.print("�ԍ�(mm) �F ");
		int height = stdIn.nextInt();
		System.out.print("�Ԓ�(mm) �F ");
		int lenght = stdIn.nextInt();
		System.out.print("�K�\������(l) �F ");
		double fuel = stdIn.nextDouble();
		
		Exe8_2_Car myCar = new Exe8_2_Car(name,number,width,height,lenght,fuel);
		
		while(true) {
			System.out.printf("���ݒn�i%.1f, %.1f)�E�c��R��%.1f[l]\n",myCar.getX(),myCar.getY(),myCar.getFuel());
			System.out.print("�ړ����܂���[0�E�E�ENo / 1�E�E�EYes] : ");
			if(stdIn.nextInt() == 0) {
				break;
			}
			
			System.out.print("X�����̈ړ����� �F ");
			double dx = stdIn.nextDouble();
			System.out.print("Y�����̈ړ����� �F ");
			double dy = stdIn.nextDouble();
			
			if(!myCar.move(dx, dy) ) {
				System.out.println("�R��������܂���I");	
			}
			
			System.out.print("�������܂���[0�E�E�ENo / 1�E�E�EYes] : ");
			if(stdIn.nextInt() == 1) {
				System.out.print("������(l) �F ");
				double f = stdIn.nextDouble();
				System.out.printf("�c��R����%.1f�ł��B\n",myCar.Refuel(f));
			}
		}
		
		
	}

}
