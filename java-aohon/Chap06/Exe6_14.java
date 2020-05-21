
//演習6-14

import java.util.Random;
import java.util.Scanner;

class Exe6_14{
	public static void main (String[] args){
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("英語の月名を入力してください。\nなお、先頭は大文字で、2文字目以降は小文字とします。\n");
        
        int[] a = new int[12];
        for(int i = 0; i < a.length; i++){
            a[i] = i+1;
        }

        String[] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        String s = "null";
        
        while(true){
            int r = rand.nextInt(12);
            while(true){
                 if(s.equals(month[r])){
                    r = rand.nextInt(7);
                }
                else{
                    break;
                }
            }
            s = month[r];
            System.out.print(a[r] + "月：");
            String s1 = stdIn.next();
            if(s1.equals(month[r])){
                System.out.print("正解です。");
                System.out.print("もう一度？ 1・・・Yes / 0・・・No :");
                int n = stdIn.nextInt();
                if(n == 0){
                    break;
                }
            } 
            else{
                System.out.println("違います。");
            }
        }

	}
}