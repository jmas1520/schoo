
//���K4-21_3(���p���E��)

import java.util.Scanner;

class Exe4_21_3{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("�i���́F");
        int n = stdIn.nextInt();

		for(int i = 1; i <= n; i++){ 
            for(int j = 1; j <= n; j++){
                if(j-i >= 0){
                   System.out.print("��"); 
                }
                else{
                   System.out.print("�@"); 
                }
            
            }
            System.out.println();
		}

	}
}