
//���K4-21_2(���p���E��)

import java.util.Scanner;

class Exe4_21_2{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("�i���́F");
        int n = stdIn.nextInt();

		for(int i = 0; i < n; i++){ 
            int m = n-i;
            for(int j = 1; j <= n; j++){
                if(j >= m){
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