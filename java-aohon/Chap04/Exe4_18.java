
//‰‰K4-18

import java.util.Scanner;

class Exe4_18{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("n‚Ì’lF");
        int n = stdIn.nextInt();

        int result =1;
		for(int i = 1; i <= n ; i++){ 
            result = i*i;
            System.out.println(i +"‚Ì2æ‚Í"+ result);
		}

	}
}