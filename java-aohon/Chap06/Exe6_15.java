
//���K6-15

import java.util.Random;
import java.util.Scanner;

class Exe6_15{
	public static void main (String[] args){
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.println("�p��̗j�������������œ��͂��Ă��������B");
        
        String[] dayE = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        String[] dayJ = {"��","��","��","��","��","�y","��"};

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
            System.out.print(dayJ[r] + "�j���F");
            String s1 = stdIn.next();
            if(s1.equals(dayE[r])){
                System.out.print("�����ł��B");
                System.out.print("������x�H 1�E�E�EYes / 0�E�E�ENo :");
                int n = stdIn.nextInt();
                if(n == 0){
                    break;
                }
            } 
            else{
                System.out.println("�Ⴂ�܂��B");
            }
        }

	}
}