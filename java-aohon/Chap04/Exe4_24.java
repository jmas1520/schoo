
//���K4-24

import java.util.Scanner;

class Exe4_24{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�f�����ǂ������ʂ��܂��B");

        int n = 0;
        for (int i = 0; n <= 0;){
            System.out.print("���ʑΏۂ́F");
            n = stdIn.nextInt(); 
        }

        if(n==2){
            System.out.println("�f���ł��B");
        }
        else if(n==1){
            System.out.println("�f���ł͂���܂���B");
        }
    
		for(int i = 2; i < n; i++){ 

            if(n%i == 0){
                System.out.println("�f���ł͂���܂���B");
                break;
            }
            else if(i == n-1){
                System.out.println("�f���ł��B");
            }

		}
	}
}