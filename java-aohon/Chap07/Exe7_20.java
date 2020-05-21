
import java.util.Scanner;

public class Exe7_20 {
	
	static void aryIns(int[] a,int idx,int x) {
		for(int i = 0; i < a.length-(idx+1); i++) {
			int t = a[idx];
			a[idx] = a[idx+i+1];
			a[idx+i+1] = t;
		}
		a[idx] = x;
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
		
		System.out.print("削除する要素は : ");
		int idx = stdIn.nextInt();
		
		System.out.print("a[idx] = ");
		int x = stdIn.nextInt();
		
		aryIns(a,idx,x);
		
		System.out.print("移動後の要素は： {");
		for(int i = 0; i < a.length; i++) {
			if(i == a.length-1) {
				System.out.printf("%d}",a[i]);
			}
			else {
				System.out.printf("%d, ",a[i]);
			}
		}	
	}
}