import java.util.Scanner;

public class Exe10_3_MinMaxtester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("xの値 : ");
		int x = stdIn.nextInt();
		System.out.print("yの値 : ");
		int y = stdIn.nextInt();
		System.out.print("zの値 : ");
		int z = stdIn.nextInt();
		
		System.out.print("配列aの要素数 : ");
		int num = stdIn.nextInt();
		int[] a = new int [num];
		for(int i = 0; i < num; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.printf("二値x,yの最小値は%dです。\n",Exe10_3_MinMax.min(x,y));
		System.out.printf("三値x,y,zの最小値は%dです。\n",Exe10_3_MinMax.min(x,y,z));
		System.out.printf("配列aの最小値は%dです。\n",Exe10_3_MinMax.min(a));
		System.out.printf("二値x,yの最大値は%dです。\n",Exe10_3_MinMax.max(x,y));
		System.out.printf("三値x,y,zの最大値は%dです。\n",Exe10_3_MinMax.max(x,y,z));
		System.out.printf("配列aの最大値は%dです。\n",Exe10_3_MinMax.max(a));
	}
}
