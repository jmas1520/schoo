
//���K6-17

import java.util.Scanner;

class Exe6_17{
	public static void main (String[] args){
        Scanner stdIn = new Scanner(System.in);
        int[][] a = new int[6][2];
        String[] s = new String[6];
        int[] sum = new int[6];
        double[] ave = new double[6];

        for(int i = 0; i < 6; i++){
            System.out.printf("%d�l�ڂ͒N�ł����F",i+1);
            s[i] = stdIn.next();
            for(int j = 0; j < 2; j++){
                if(j == 0){
                    System.out.print("����̓_���́F");
                    a[i][j] = stdIn.nextInt();
                }
                else {
                    System.out.print("���w�̓_���́F");
                    a[i][j] = stdIn.nextInt();
                } 
            }
        }
        System.out.println();

        //�Ȗڂ��Ƃ̕��ς��Z�o
        int sumL = 0,sumM = 0;
        double aveL,aveM;
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 2; j++){
                if(j == 0){
                    sumL += a[i][j];
                }
                else {
                    sumM += a[i][j];
                }
            }
        }
        aveL = (double)sumL / 6;
        aveM = (double)sumM / 6;
        System.out.printf("����̕��ϓ_��%.1f�ł��B\n���w�̕��ϓ_��%.1f�ł��B\n",aveL,aveM);

        //�w�����Ƃ̕��ς��Z�o
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 2; j++){
                sum[i] += a[i][j]; 
            }
            ave[i] = (double)sum[i] / 2;
            System.out.printf("%s�̕��ϓ_��%.1f�ł��B\n",s[i],ave[i]);
        }

	}
}