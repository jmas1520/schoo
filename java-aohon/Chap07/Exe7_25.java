
import java.util.Scanner;

public class Exe7_25 {
	
	static int[] arrayRmvOfN(int[] a,int idx,int n) {
		for(int i = 0; i < a.length-(idx+n); i++) {
			a[idx+i] = a[idx+n+i];
		}
		
		int[] b = new int[a.length-n];
		for(int i = 0; i < a.length-n; i++) {
			b[i] = a[i];
		}
		return b;
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
		
		System.out.print("�폜����v�f�̃C���f�b�N�X���� : ");
		int idx = stdIn.nextInt();
		
		System.out.print("n�̒l : ");
		int n = stdIn.nextInt();
		
		int[] b = arrayRmvOfN(a,idx,n);
		
		System.out.print("�폜��̗v�f�́F {");
		for(int i = 0; i < b.length; i++) {
			if(i == b.length-1) {
				System.out.printf("%d}",b[i]);
			}
			else {
				System.out.printf("%d, ",b[i]);
			}
		}	
	}
}