
import java.util.Scanner;
import java.util.Random;

public class Exe7_8 {
	
	static int Random(int a,int b) {
		Random rand = new Random();
		int luck = rand.nextInt(b-a)+a;
		return luck;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);		
		
		System.out.print("aの値：");
		int a = stdIn.nextInt();
		System.out.print("bの値：");
		int b = stdIn.nextInt();
		
		System.out.printf("%d以上%d以下の乱数は%dです。",a,b,Random(a,b));

	}

}