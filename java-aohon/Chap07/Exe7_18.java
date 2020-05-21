
import java.util.Scanner;

public class Exe7_18 {
	
	static void aryRmv(int[] a,int idx) {
		a[idx] = a[idx+1];
		for(int i = 1; i < a.length-idx-1; i++) {
			a[idx+i] = a[idx+i+1];
		}
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
		
		System.out.print("íœ‚·‚é—v‘f‚Í : ");
		int idx = stdIn.nextInt();
		
		aryRmv(a,idx);
		
		System.out.print("íœŒã‚Ì—v‘f‚ÍF {");
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