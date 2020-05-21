
public class Exe10_1_Id {
	private static int counter = 0;
	private int id;
	
	//コンストラクタ
	public Exe10_1_Id() {
		id = ++counter;
	}
	
	//識別番号取得
	public int getId() {
		return id;
	}
	
	//最後の識別番号取得
	public static int getMaxId() {
		return counter;
	}
}
