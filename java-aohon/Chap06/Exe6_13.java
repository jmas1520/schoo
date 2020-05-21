
//演習6-13

import java.util.Scanner;

class Exe6_13{
	public static void main (String[] args){
        Scanner stdIn = new Scanner(System.in);
        
        int[] a = {1,2,3,4,5};
        int[] b = new int[5];

        System.out.println("配列aの要素を逆順に配列bにコピーします。");
        System.out.print("a = ");

        for(int i = 1;i <= a.length; i++){
            b[i-1] = a[a.length-i];
            System.out.print(a[i-1] + " ");
        }

        System.out.print("\nb = ");

        for(int i = 0; i < a.length; i++){
            System.out.print(b[i] + " ");
        }

	}
}