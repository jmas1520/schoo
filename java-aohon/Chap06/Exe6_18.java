
//演習6-18

import java.util.Scanner;

class Exe6_18{
	public static void main (String[] args){
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("行数は:");
        int n = stdIn.nextInt();
        
        int[][] c = new int[n][];
        for(int i = 0; i < c.length; i++){
            System.out.printf("%d行目の列数は：",i+1);
            int m = stdIn.nextInt();
            c[i] = new int[m];
        }

        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c[i].length; j++){
                System.out.printf("c[%d][%d] = ",i,j);
                c[i][j] = stdIn.nextInt();
            }
        }

        System.out.println("行列を表示します。");
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c[i].length; j++){
                System.out.printf("%3d",c[i][j]);
            }
            System.out.println();
        }

	}
}