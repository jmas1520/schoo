
//演習6-15

import java.util.Random;
import java.util.Scanner;

class Exe6_15{
	public static void main (String[] args){
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.println("英語の曜日名を小文字で入力してください。");
        
        String[] dayE = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        String[] dayJ = {"月","火","水","木","金","土","日"};

        int[] a = new int[7];
        String s = "null";
        while(true){
            int r = rand.nextInt(7);
            while(true){
                 if(s.equals(dayE[r])){
                    r = rand.nextInt(7);
                }
                else{
                    break;
                }
            }
            s = dayE[r];
            System.out.print(dayJ[r] + "曜日：");
            String s1 = stdIn.next();
            if(s1.equals(dayE[r])){
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