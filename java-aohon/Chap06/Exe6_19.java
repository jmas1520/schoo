
//���K6-19

import java.util.Scanner;

class Exe6_19{
	public static void main (String[] args){
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("�N���X��:");
        int c = stdIn.nextInt();

        int[][] a = new int[c][];
        int[] m = new int[c];
        int[] sum = new int [c];
        int allm = 0;
        double[] ave = new double [c];
        for(int i = 0; i < c; i++){
            System.out.printf("%d�g�̐l���F",i+1);
            m[i] = stdIn.nextInt();
            a[i] = new int[m[i]];
            for(int j = 0; j < m[i]; j++){
                System.out.printf("%d�g%d�Ԃ̓_���F",i+1,j+1);
                a[i][j] = stdIn.nextInt();
                sum[i] += a[i][j];
            }
            allm += m[i]; 
            ave[i] = (double)sum[i] / m[i];
            System.out.println();
        }

        int allsum =0;
        System.out.println(" �g �@�@���v�@�@����");
        for(int i = 0; i < c; i++){
            System.out.printf("%d�g %8d %7.1f\n",i+1,sum[i],ave[i]);
            allsum += sum[i];   
        }

        double allave = (double)allsum / allm;
        System.out.printf(" �v %8d %7.1f",allsum,allave);

	}
}