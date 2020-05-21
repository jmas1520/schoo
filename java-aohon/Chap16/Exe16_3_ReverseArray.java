
import java.util.Scanner;

public class Exe16_3_ReverseArray {
	
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
			e.printStackTrace();
			System.exit(1);
		}
		catch(NullPointerException e) {
			System.out.println("y[] = null ‚Å‚·B");
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int[] y = null;
		reverse(y);
		
		System.out.print("—v‘f” : ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] F ");
			x[i] = stdIn.nextInt();
		}
		
		reverse(x);
		
		System.out.println("—v‘f‚Ì•À‚Ñ‚ð”½“]‚µ‚Ü‚µ‚½B");
		for(int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
	}
}
