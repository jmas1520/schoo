
//���K6-16

import java.util.Scanner;

class Exe6_16{
	public static void main (String[] args){
        Scanner stdIn = new Scanner(System.in);
        int[][] a = new int[4][3];
        int[][] b = new int[3][4];
        int[][] c = new int[4][4]; 

        System.out.println("�s��a (4�s3��)�̗v�f����͂��Ă��������B");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                System.out.printf("a[%d][%d] = ",i,j);
                a[i][j] = stdIn.nextInt(); 
            }
        }

        System.out.println("�s��a (4�s3��)");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                System.out.printf("%3d",a[i][j]);
            }
            System.out.println();
        }

        System.out.println("�s��b (3�s4��)�̗v�f����͂��Ă��������B");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.printf("b[%d][%d] = ",i,j);
                b[i][j] = stdIn.nextInt(); 
            }
        }

        System.out.println("�s��b (3�s4��)");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.printf("%3d",b[i][j]); 
            }
            System.out.println();
        }       
        
        System.out.println("�s��a,b�̐ς����߂܂��B(�s��c)");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 3; k++){
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
               System.out.printf("%3d",c[i][j]); 
            }
            System.out.println();
        }

	}
}