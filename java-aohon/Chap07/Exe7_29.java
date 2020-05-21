

public class Exe7_29 {
	
	static int[][] aryClone2(int[][] a) {
		int[][] b = new int[a.length][a[0].length];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				b[i][j] = a[i][j];
			}
		}
		return b;
	}
	
	static void printMatrix(int[][] m) {
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
	
		int[][] a = { {1,2,3}, {4,5,6} };
		int[][] b = aryClone2(a);
		
		System.out.println("s—ña");
		printMatrix(a);
		System.out.println("s—ñb");
		printMatrix(b);
	}
}