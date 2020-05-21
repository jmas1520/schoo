
import java.util.Scanner;

public class Exe7_33 {
	
	static void printArray(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.printf("%d ",a[i]);
		}
		System.out.println();
	}
	
	static void printArray(int[][] a) {
		for(int i = 0; i < a.length; i++) {
			if(i == 0) {
			System.out.printf("%-3d %-5d %-4d %-2d %d",a[i][0],a[i][1],a[i][2],a[i][3],a[i][4]);
			}
			else if(i == 1) {
				System.out.printf("%-3d %-5d %-4d",a[i][0],a[i][1],a[i][2]);
			}
			else if(i == 2) {
				System.out.printf("%-3d %-5d %-4d %-2d",a[i][0],a[i][1],a[i][2],a[i][3]);
			}
			System.out.println();
		} 
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		int[] a = {12,536,-8,7};
		int[][] b = {{32,-1,32,45,67},
					 {535,99999,2},
				     {2,5,-123,9},};
		
		System.out.println("1次元配列の全要素を表示");
		printArray(a);
		
		System.out.println("2次元配列の全要素を表示 ");
		printArray(b);
	}
}