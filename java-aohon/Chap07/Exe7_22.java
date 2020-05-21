
import java.util.Scanner;

public class Exe7_22 {
	
	static int[] arrayClone (int[] a) {
		int[] clone = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			clone[i] = a[i];
		}
		return clone;
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
		
		System.out.println("配列aをコピーします。");
		
		int[] c = arrayClone(a); 
		System.out.print("配列cloneの要素は： {");
		for(int i = 0; i < c.length; i++) {
			if(i == c.length-1) {
				System.out.printf("%d}\n",c[i]);
			}
			else {
				System.out.printf("%d, ",c[i]);
			}
		}
	}
}