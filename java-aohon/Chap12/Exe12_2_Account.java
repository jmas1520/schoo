
public class Exe12_2_Account {
	private static int counter = 0;
	private String name;
	private String no;
	private long balance;
	private int id;

	//コンストラクタ
	public Exe12_2_Account(String name,String no,long balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
		id = ++counter;
	}
	
	//口座名義を調べる
	public String getName() {
		return name;
	}
	
	//口座番号を調べる
	public String getNo() {
		return no;
	}
	
	//預金残高を調べる
	public long getBalance() {
		return balance;
	}
	
	//識別番号を取得
	public int getId() {
		return id;
	}
	
	//k円預ける
	public void deposit(long k) {
		balance += k;
	}
	
	//k円おろす
	public void withdraw(long k) {
		balance -= k;
	}
	
}
