
public class Exe12_2_AccountSub extends Exe12_2_Account{
	private long timeBalance;
	
	//コンストラクタ
	public Exe12_2_AccountSub(String name,String no,long balance,long timeBalance){
		super(name,no,balance);
		this.timeBalance = timeBalance;
	}
	
	//定期預金を調べる
	public long getTimeBalance() {
		return timeBalance;
	}
	//合計残高を調べる
	@Override public long getBalance() {
		return super.getBalance() + timeBalance;
	}

	//普通預金と定期預金の合計残高の比較
	static int compBalance(Exe12_2_Account a,Exe12_2_Account b) {
		if(a.getBalance() > b.getBalance()) {
			return 1;
		}
		else if(a.getBalance() < b.getBalance()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	
}
