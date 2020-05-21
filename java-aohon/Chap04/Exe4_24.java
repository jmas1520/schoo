
//‰‰K4-24

import java.util.Scanner;

class Exe4_24{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("‘f”‚©‚Ç‚¤‚©”»•Ê‚µ‚Ü‚·B");

        int n = 0;
        for (int i = 0; n <= 0;){
            System.out.print("”»•Ê‘ÎÛ‚ÍF");
            n = stdIn.nextInt(); 
        }

        if(n==2){
            System.out.println("‘f”‚Å‚·B");
        }
        else if(n==1){
            System.out.println("‘f”‚Å‚Í‚ ‚è‚Ü‚¹‚ñB");
        }
    
		for(int i = 2; i < n; i++){ 

            if(n%i == 0){
                System.out.println("‘f”‚Å‚Í‚ ‚è‚Ü‚¹‚ñB");
                break;
            }
            else if(i == n-1){
                System.out.println("‘f”‚Å‚·B");
            }

		}
	}
}