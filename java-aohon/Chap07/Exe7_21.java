
import java.util.Scanner;

public class Exe7_21 {
	
	static void aryExchng(int[] a,int[] b) {
		if(a.length > b.length) {
			for(int i = 0; i < b.length; i++) {
				int t = a[i];
				a[i] = b[i];
				b[i] = t;
			}
		}
		else {
			for(int i = 0; i < a.length; i++) {
				int t = a[i];
				a[i] = b[i];
				b[i] = t;
			}
		}
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
		
		System.out.print("�z��b�̗v�f�� : ");
		int nb = stdIn.nextInt();
		int[] b = new int [nb];
		
		for(int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "] = ");
			b[i] = stdIn.nextInt();
		}
		
		System.out.println("�z��a,b�̗v�f���������܂��B");
		
		aryExchng(a,b);
		
		System.out.print("������̔z��a�̗v�f�́F {");
		for(int i = 0; i < a.length; i++) {
			if(i == a.length-1) {
				System.out.printf("%d}\n",a[i]);
			}
			else {
				System.out.printf("%d, ",a[i]);
			}
		}
		
		System.out.print("������̔z��b�̗v�f�́F {");
		for(int i = 0; i < b.length; i++) {
			if(i == b.length-1) {
				System.out.printf("%d}\n",b[i]);
			}
			else {
				System.out.printf("%d, ",b[i]);
			}
		}
	}
}