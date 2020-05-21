
//演習6-17

import java.util.Scanner;

class Exe6_17{
	public static void main (String[] args){
        Scanner stdIn = new Scanner(System.in);
        int[][] a = new int[6][2];
        String[] s = new String[6];
        int[] sum = new int[6];
        double[] ave = new double[6];

        for(int i = 0; i < 6; i++){
            System.out.printf("%d人目は誰ですか：",i+1);
            s[i] = stdIn.next();
            for(int j = 0; j < 2; j++){
                if(j == 0){
                    System.out.print("国語の点数は：");
                    a[i][j] = stdIn.nextInt();
                }
                else {
                    System.out.print("数学の点数は：");
                    a[i][j] = stdIn.nextInt();
                } 
            }
        }
        System.out.println();

        //科目ごとの平均を算出
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
        System.out.printf("国語の平均点は%.1fです。\n数学の平均点は%.1fです。\n",aveL,aveM);

        //学生ごとの平均を算出
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 2; j++){
                sum[i] += a[i][j]; 
            }
            ave[i] = (double)sum[i] / 2;
            System.out.printf("%sの平均点は%.1fです。\n",s[i],ave[i]);
        }

	}
}