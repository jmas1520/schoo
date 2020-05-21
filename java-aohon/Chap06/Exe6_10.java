
//‰‰K6-10

import java.util.Random;
import java.util.Scanner;

class Exe6_10{
	public static void main (String[] args){
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("—v‘f”F");
        int n = stdIn.nextInt();
        int[]  a = new int[n];


        for(int i = 0;i < a.length; i++){
            a[i] = rand.nextInt(10)+1;
            if(i == 0){
                continue;
            }
            while(true){
                if(a[i-1] == a[i]){
                    a[i] = rand.nextInt(10)+1;
                }
                else{
                    break;
                }
            }
        }

        for(int j = 1; j <= a.length; j++){
            
            if(j == 1){
                System.out.printf("a = {%d",a[j-1]);
            }
            else if(j == a.length){
                System.out.printf(", %d}",a[j-1]);
            }
            else{
                System.out.printf(", %d",a[j-1]);
            }
        }

	}
}