import java.util.Scanner;

public class Exe10_3_MinMaxtester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("x�̒l : ");
		int x = stdIn.nextInt();
		System.out.print("y�̒l : ");
		int y = stdIn.nextInt();
		System.out.print("z�̒l : ");
		int z = stdIn.nextInt();
		
		System.out.print("�z��a�̗v�f�� : ");
		int num = stdIn.nextInt();
		int[] a = new int [num];
		for(int i = 0; i < num; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.printf("��lx,y�̍ŏ��l��%d�ł��B\n",Exe10_3_MinMax.min(x,y));
		System.out.printf("�O�lx,y,z�̍ŏ��l��%d�ł��B\n",Exe10_3_MinMax.min(x,y,z));
		System.out.printf("�z��a�̍ŏ��l��%d�ł��B\n",Exe10_3_MinMax.min(a));
		System.out.printf("��lx,y�̍ő�l��%d�ł��B\n",Exe10_3_MinMax.max(x,y));
		System.out.printf("�O�lx,y,z�̍ő�l��%d�ł��B\n",Exe10_3_MinMax.max(x,y,z));
		System.out.printf("�z��a�̍ő�l��%d�ł��B\n",Exe10_3_MinMax.max(a));
	}
}
