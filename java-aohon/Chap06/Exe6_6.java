
//���K6-6

import java.util.Scanner;

class Exe6_6{
	public static void main (String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("�̓_�l���́F");
        int m = stdIn.nextInt();
        int[] p = new int[m];

        int sum = 0;
        for(int i = 0; i < p.length; i++){
            System.out.printf("%d�Ԃ̓_���́F",i+1);
            p[i] = stdIn.nextInt();

            sum += p[i];
        }

        double ave = (double)sum / m;
        int max = p[0],min = p[0];

        for(int j = 0; j < p.length; j++){
            if(p[j] > max){
                max = p[j];
            }
            else if(p[j] < min){
                min = p[j];
            }
        }

        System.out.printf("���v�_��%d�ł��B\n���ϓ_��%.1f�ł��B\n�ō��_��%d�ł��B\n�Œ�_��%d�ł��B",sum,ave,max,min);
	}
}