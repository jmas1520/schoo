
//演習4-19

import java.util.Scanner;

class Exe4_19{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
        int retry,month;
        do{
            do{
                System.out.print("季節を求めます。\n何月ですか：");
                month = stdIn.nextInt();
            }while(1 > month || month > 12);
            
            if(3 <= month && month <= 5){
                System.out.println("それは春です。");
            }
            else if(6 <= month && month <= 8){
                System.out.println("それは夏です。");
            }
            else if(9 <= month && month <= 11){
                System.out.println("それは秋です。");
            }
            else if(month == 12 || month == 1 || month == 2){
                System.out.println("それは冬です。");
            }

            System.out.print("もう一度？　1・・・Yes / 0・・・No：");
            retry = stdIn.nextInt();
	
		} while(retry == 1);
	}
}