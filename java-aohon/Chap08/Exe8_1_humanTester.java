
import java.util.Scanner;

public class Exe8_1_humanTester {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�ʃf�[�^����͂��Ă������B");
		System.out.print("���O �F ");
		String name = stdIn.next();
		System.out.print("�N�� �F ");
		int age = stdIn.nextInt();
		System.out.print("�g��(cm) �F ");
		double height = stdIn.nextDouble();
		System.out.print("�̏d(kg) �F ");
		double weight = stdIn.nextDouble();	
		
		Exe8_1_human Human = new Exe8_1_human(name,age,height,weight);
		
		System.out.println("�ʃf�[�^���o�͂��܂��B");
		Human.putSpec();
		System.out.printf("BMI �F %.3f",Human.getBmi(weight,height));
		
	}
}
