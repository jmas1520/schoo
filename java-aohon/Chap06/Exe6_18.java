
//���K6-18

import java.util.Scanner;

class Exe6_18{
	public static void main (String[] args){
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("�s����:");
        int n = stdIn.nextInt();
        
        int[][] c = new int[n][];
        for(int i = 0; i < c.length; i++){
            System.out.printf("%d�s�ڂ̗񐔂́F",i+1);
            int m = stdIn.nextInt();
            c[i] = new int[m];
        }

        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c[i].length; j++){
                System.out.printf("c[%d][%d] = ",i,j);
                c[i][j] = stdIn.nextInt();
            }
        }

        System.out.println("�s���\�����܂��B");
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c[i].length; j++){
                System.out.printf("%3d",c[i][j]);
            }
            System.out.println();
        }

	}
}