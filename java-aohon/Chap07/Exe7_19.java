
import java.util.Scanner;

public class Exe7_19 {
	
	static void aryRmvN(int[] a,int idx,int n) {
		for(int i = 0; i < a.length-(idx+n); i++) {
			a[idx+i] = a[idx+n+i];
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
		
		System.out.print("n‚Ì’l : ");
		int n = stdIn.nextInt();
		
		aryRmvN(a,idx,n);
		
		System.out.print("ˆÚ“®Œã‚Ì—v‘f‚ÍF {");
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