
//‰‰K6-3

class Exe6_3{
	public static void main (String[] args){
        double[] a = new double[5];

        for(int i = 1; i <= a.length; i++){
            a[i-1] = i*1.1;

            System.out.printf("a[%d] = %2.1f\n",i-1,a[i-1]);
        }

	}
}