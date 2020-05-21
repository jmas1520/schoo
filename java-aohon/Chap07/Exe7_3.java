
import java.util.Scanner;

public class Exe7_3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int[] a = new int[3];
		for(int i = 0; i < a.length; i++) {
			System.out.printf("a[%d]‚Ì’lF",i);
			a[i] = stdIn.nextInt();
		}
		
		System.out.println("’†‰›’l‚Í" + med(a[0],a[1],a[2]) + "‚Å‚·");

	}
	
	static int med(int a,int b, int c) {
		int med = a;
		if(a > b) {
			int t = a;
			a = b;
			b = t;
		}
		if(c < b){
			int t = c;
			c = b;
			b = t;
			if(b < a) {
				int s = a;
				a = b;
				b = s;
			}
		}
		
		
		return med = b;
	}

}