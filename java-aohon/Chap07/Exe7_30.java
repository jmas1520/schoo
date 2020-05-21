
import java.util.Scanner;

public class Exe7_30 {
	
	static int min(int a,int b) {
		return a < b ? a : b;
	}

	static int min(int a,int b,int c) {
		int min = a;
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		return min;
	}
	
	static int min(int[] a) {
		int min = a[0];
		for(int i = 1; i < a.length; i++) {
			if(a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}
	
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
		
		
		System.out.printf("��lx,y�̍ŏ��l��%d�ł��B\n",min(x,y));
		System.out.printf("�O�lx,y,z�̍ŏ��l��%d�ł��B\n",min(x,y,z));
		System.out.printf("�z��a�̍ŏ��l��%d�ł��B\n",min(a));
	}
}