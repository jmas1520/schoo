
//‰‰K6-5

import java.util.Scanner;

class Exe6_5{
	public static void main (String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("—v‘f”F");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < a.length; i++){
            System.out.printf("a[%d] = ",i);
            a[i] = stdIn.nextInt();
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