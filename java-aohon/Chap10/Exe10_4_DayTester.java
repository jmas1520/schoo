import java.util.Scanner;

public class Exe10_4_DayTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int y,m,d;
		
		Exe10_4_Day a = new Exe10_4_Day();
		System.out.println(a.getYear() + "�N" + a.getMonth() + "��" + a.getDate() + "��");
		
		System.out.println("���t����͂���B");
		System.out.print("�N �F ");
		y = stdIn.nextInt();
		System.out.print("�� �F ");
		m = stdIn.nextInt();
		System.out.print("�� �F ");
		d = stdIn.nextInt();
		
		Exe10_4_Day b = new Exe10_4_Day(y,m,d);
		System.out.println(b.getYear() + "�N" + b.getMonth() + "��" + b.getDate() + "��");
		
		System.out.println("�N���̌o�ߓ�����" + b.DateProgress() + "���ł��B");
		
	}
}
