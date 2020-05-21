
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
		
		System.out.print("要素数 : ");
		int num = stdIn.nextInt();
		int[] a = new int [num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("探す値 : ");
		int key = stdIn.nextInt();
		int idx = linearSearch(a,key);
		
		System.out.println("後ろから探査します。");
		if(idx == -1) {
			System.out.println("その値の要素は存在しません。");
		}
		else {
			System.out.println("その値はa[" + idx + "]にあります。");
		}
				
	}

}