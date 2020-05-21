
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
		
		System.out.print("要素数 : ");
		int num = stdIn.nextInt();
		int[] a = new int [num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("削除する要素のインデックス数は : ");
		int idx = stdIn.nextInt();
		
		System.out.print("nの値 : ");
		int n = stdIn.nextInt();
		
		int[] b = arrayRmvOfN(a,idx,n);
		
		System.out.print("削除後の要素は： {");
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