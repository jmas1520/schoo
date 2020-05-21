
//‰‰K5-3

import java.util.Scanner;

class Exe5_3{
	public static void main (String[] args){
		Scanner stdIn = new Scanner(System.in);

        System.out.println("¬l‚µ‚Ä‚¢‚é‚©”»•Ê‚µ‚Ü‚·B");
		System.out.print("‰½Î‚Å‚·‚©F");
		int x = stdIn.nextInt();

		boolean age1 = true,age2 = false;
        if(x >= 20){
            System.out.println(age1);
        }
        else{
            System.out.println(age2);
        }

	}
}