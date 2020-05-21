
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
		
		System.out.print("配列aの要素数 : ");
		int na = stdIn.nextInt();
		int[] a = new int [na];
		
		for(int i = 0; i < na; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("配列bの要素数 : ");
		int nb = stdIn.nextInt();
		int[] b = new int [nb];
		
		for(int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "] = ");
			b[i] = stdIn.nextInt();
		}
		
		System.out.println("配列a,bの要素を交換します。");
		
		aryExchng(a,b);
		
		System.out.print("交換後の配列aの要素は： {");
		for(int i = 0; i < a.length; i++) {
			if(i == a.length-1) {
				System.out.printf("%d}\n",a[i]);
			}
			else {
				System.out.printf("%d, ",a[i]);
			}
		}
		
		System.out.print("交換後の配列bの要素は： {");
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