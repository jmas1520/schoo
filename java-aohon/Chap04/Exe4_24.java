
//演習4-24

import java.util.Scanner;

class Exe4_24{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("素数かどうか判別します。");

        int n = 0;
        for (int i = 0; n <= 0;){
            System.out.print("判別対象は：");
            n = stdIn.nextInt(); 
        }

        if(n==2){
            System.out.println("素数です。");
        }
        else if(n==1){
            System.out.println("素数ではありません。");
        }
    
		for(int i = 2; i < n; i++){ 

            if(n%i == 0){
                System.out.println("素数ではありません。");
                break;
            }
            else if(i == n-1){
                System.out.println("素数です。");
            }

		}
	}
}