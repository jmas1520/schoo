
import java.util.Scanner;

public class Exe7_17 {
	
	static int linearSearch(int[] a,int key) {
		for(int i = a.length-1; i >= 0; i--) {
			if(a[i] == key) {
				return i;
			}
		}
		return -1;
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
		
		System.out.print("’T‚·’l : ");
		int key = stdIn.nextInt();
		int idx = linearSearch(a,key);
		
		System.out.println("Œã‚ë‚©‚ç’T¸‚µ‚Ü‚·B");
		if(idx == -1) {
			System.out.println("‚»‚Ì’l‚Ì—v‘f‚Í‘¶İ‚µ‚Ü‚¹‚ñB");
		}
		else {
			System.out.println("‚»‚Ì’l‚Ía[" + idx + "]‚É‚ ‚è‚Ü‚·B");
		}
				
	}

}