
//演習6-12

import java.util.Random;
import java.util.Scanner;

class Exe6_12{
	public static void main (String[] args){
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        
        int[] a = {1,2,3,4,5,6,7,8};
        int[] b = a;

        System.out.println("a = {1, 2, 3, 4, 5, 6, 7, 8} の配列をシャッフルします。");

        for(int i = 0;i < a.length; i++){
            int r = rand.nextInt(a.length);

            int t = a[r];
            a[r] = b[i];
            b[i] = t;
        }


        for(int j = 1; j <= a.length; j++){
            
            if(j == 1){
                System.out.printf("a = {%d",b[j-1]);
            }
            else if(j == a.length){
                System.out.printf(", %d}",b[j-1]);
            }
            else{
                System.out.printf(", %d",b[j-1]);
            }
        }

	}
}