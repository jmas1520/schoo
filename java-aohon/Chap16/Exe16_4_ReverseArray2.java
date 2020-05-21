import java.util.Scanner;

public class Exe16_4_ReverseArray2 {
	static void swap(int[] a,int idx1,int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		try {
			for(int i = 0; i < a.length / 2; i++) {
				swap(a,i,a.length - i);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			throw new RuntimeException("reverseのバグ？",e);
		}
		catch(NullPointerException e) {
			throw new RuntimeException("reverseのバグ？",e);
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int[] y = null;
		
		try {
			reverse(y);
		}
		catch(RuntimeException e) {
			System.out.println("例外　　　 ： " + e);
			System.out.println("例外の原因 ： " + e.getCause());
		}
		
		System.out.print("要素数 : ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] ： ");
			x[i] = stdIn.nextInt();
		}
		
		try {
			reverse(x);
			
			System.out.println("要素の並びを反転しました。");
			for(int i = 0; i < num; i++) {
				System.out.println("x[" + i + "] = " + x[i]);
			}
		}
		catch(RuntimeException e) {
			System.out.println("例外　　　 ： " + e);
			System.out.println("例外の原因 ： " + e.getCause());
		}
		
	}
}
