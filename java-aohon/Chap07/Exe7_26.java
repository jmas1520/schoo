
import java.util.Scanner;

public class Exe7_26 {
	
	static int[] arrayInsOf(int[] a,int idx,int x) {
		int[] b = new int[a.length+1];
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		
		for(int i = 1; i < b.length-idx; i++) {
			int t = b[idx];
			b[idx] = b[idx+i];
			b[idx+i] = t;
		}
		b[idx] = x;
		
		return b;
	}

	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("—v‘f” : ");
		int num = stdIn.nextInt();
		int[] a = new int [num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("‘}“ü‚µ‚½‚¢‰ÓŠ‚ÌƒCƒ“ƒfƒbƒNƒX”‚Í : ");
		int idx = stdIn.nextInt();
		
		System.out.print("a[idx] = ");
		int x = stdIn.nextInt();
		
		int[] b = arrayInsOf(a,idx,x);
		
		System.out.print("‘}“üŒã‚Ì—v‘f‚ÍF {");
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