
public class Exe12_2_AccountSub extends Exe12_2_Account{
	private long timeBalance;
	
	//�R���X�g���N�^
	public Exe12_2_AccountSub(String name,String no,long balance,long timeBalance){
		super(name,no,balance);
		this.timeBalance = timeBalance;
	}
	
	//����a���𒲂ׂ�
	public long getTimeBalance() {
		return timeBalance;
	}
	//���v�c���𒲂ׂ�
	@Override public long getBalance() {
		return super.getBalance() + timeBalance;
	}

	//���ʗa���ƒ���a���̍��v�c���̔�r
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
