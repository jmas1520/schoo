
//‰‰K5-6

class Exe5_6{
	public static void main (String[] args){
        System.out.printf("%7s  %9s\n","float","int");

        int i = 0;
        for(float x = 0.0F; x <= 1.0F; x += 0.001F){
            System.out.printf("%.7f",x);

            float y = (float)i / 1000;
            System.out.printf("%12.7f\n",y);
            i++;     
    
        } 

	}
}