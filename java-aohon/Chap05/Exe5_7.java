
//‰‰K5-7

class Exe5_7{
	public static void main (String[] args){
        System.out.printf("%6s   %9s\n","sum","spu");

        for(int i = 0; i <= 1000; i++){

            float x = (float)i / 1000;
            System.out.printf("%.7f",x);
            System.out.printf("%12.7f\n",x*x);
        } 

	}
}