
import java.util.Scanner;

public class Exe7_24 {
	
	static int[] arrayRmvOf(int[] a,int idx) {
		for(int i = 0; i < a.length-idx-1; i++) {
			a[idx+i] = a[idx+i+1];
		}
		
		int[] b = new int[a.length-1];
		for(int i = 0; i < a.length-1; i++) {
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
		
		int[] b = arrayRmvOf(a,idx);
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