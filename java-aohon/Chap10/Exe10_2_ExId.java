
public class Exe10_2_ExId {
	private static int counter = 0;
	private int id;
	
	//コンストラクタ
	public Exe10_2_ExId(int dis,int n) {
		if(dis == 1) {
			counter += n;
			id = counter;
		}
		else {
			id = ++counter;
		}
	}
	
	//識別番号取得
	public int getExId() {
		return id;
	}
	
	//最後の識別番号取得
	public static int getMaxExId() {
		return counter;
	}
}
