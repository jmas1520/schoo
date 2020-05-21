
//‰‰K6-4

import java.util.Random;
import java.util.Scanner;

class Exe6_4{
	public static void main (String[] args){
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("—v‘f”F");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < a.length; i++){
            a[i] = 1 + rand.nextInt(10);
        }

        for(int j = 0; j < a.length; j++){
            for(int k = 0;k < a.length; k++){
                if(10-a[k] >= j){
                    System.out.print("  ");
                }
                else{
                    System.out.print('*' + " "); 
                }
            }
            System.out.println();
        }

        int m = 0;
        while(m < a.length){
            System.out.print(m%10 + " ");
            m++;
        }

	}
}