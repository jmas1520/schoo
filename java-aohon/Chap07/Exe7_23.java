
import java.util.Scanner;

public class Exe7_23 {
	
	static int[] arraySrchIdx (int[] a,int x) {
		int count = 0; 
		for(int i = 0; i < a.length; i++) {
			if(a[i] == x) {
				count += 1;
			}
		}
		int[] c = new int[1];
		if(count == 0) {
			return c;
		}
		
		int[] b = new int[count];
		int j = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == x) {
				b[j] = i;
				j++;
			}
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�z��a�̗v�f�� : ");
		int na = stdIn.nextInt();
		int[] a = new int [na];
		for(int i = 0; i < na; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("x�̒l : ");
		int x = stdIn.nextInt();
		
		int[] s  = arraySrchIdx(a,x);
		if(s[0] == 0 ) {
			System.out.printf("�z��a�̒��ɂ�%d�͂���܂���B",x);
		}
		else {
			System.out.printf("�z��a�̗v�f���Œl��%d�ł���C���f�b�N�X�́F {",x);
			for(int i = 0; i < s.length; i++) {
				if(i == s.length-1) {
					System.out.printf("%d}\n",s[i]);
				}
				else {
					System.out.printf("%d, ",s[i]);
				}
			}
		}
	}
}