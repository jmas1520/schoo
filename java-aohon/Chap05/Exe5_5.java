
//���K5-5

import java.util.Scanner;

class Exe5_5{
	public static void main (String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("x�̒l�F");
		int x = stdIn.nextInt();

        System.out.print("y�̒l�F");
		int y = stdIn.nextInt();

        System.out.print("z�̒l�F");
		int z = stdIn.nextInt();

        int sum = x + y + z;
        double ave = (double)sum / 3;

        System.out.println("���v��" + sum + "�ł��B");
        System.out.println("���ς�" + ave + "�ł��B");

	}
}