
import java.util.Scanner;

public class Exe7_16 {
	
	static int minOf(int[] a) {
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
		
		System.out.print("�v�f�� : ");
		int num = stdIn.nextInt();
		int[] a = new int [num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.println("�S�v�f�̍ŏ��l��" + minOf(a) + "�ł��B");		
	}

}