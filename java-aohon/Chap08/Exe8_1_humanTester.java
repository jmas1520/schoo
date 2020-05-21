
import java.util.Scanner;

public class Exe8_1_humanTester {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("個別データを入力してださい。");
		System.out.print("名前 ： ");
		String name = stdIn.next();
		System.out.print("年齢 ： ");
		int age = stdIn.nextInt();
		System.out.print("身長(cm) ： ");
		double height = stdIn.nextDouble();
		System.out.print("体重(kg) ： ");
		double weight = stdIn.nextDouble();	
		
		Exe8_1_human Human = new Exe8_1_human(name,age,height,weight);
		
		System.out.println("個別データを出力します。");
		Human.putSpec();
		System.out.printf("BMI ： %.3f",Human.getBmi(weight,height));
		
	}
}
