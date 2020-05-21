
//‰‰K6-11

import java.util.Random;
import java.util.Scanner;

class Exe6_11{
	public static void main (String[] args){
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        
        int n;
        do{
            System.out.print("—v‘f”F");
            n = stdIn.nextInt();
        } while(n > 10 || n <= 0);

        int[] a = new int[10];
        for(int i = 1;i <= a.length; i++){
            a[i-1] = i;
        }

        int[] b = new int[10];
        boolean[] c = new boolean[10];


        for(int i = 0;i < n; i++){

            while(true){
                int r = rand.nextInt(10);

                if(c[r] == false){
                    c[r] = true;
                    b[i] = a[r];
                    break;
                }
            }
        }

        for(int j = 1; j <= n; j++){
            
            if(j == 1){
                System.out.printf("a = {%d",b[j-1]);
            }
            else if(j == n){
                System.out.printf(", %d}",b[j-1]);
            }
            else{
                System.out.printf(", %d",b[j-1]);
            }
        }

	}
}