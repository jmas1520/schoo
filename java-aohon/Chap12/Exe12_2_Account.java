
public class Exe12_2_Account {
	private static int counter = 0;
	private String name;
	private String no;
	private long balance;
	private int id;

	//�R���X�g���N�^
	public Exe12_2_Account(String name,String no,long balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
		id = ++counter;
	}
	
	//�������`�𒲂ׂ�
	public String getName() {
		return name;
	}
	
	//�����ԍ��𒲂ׂ�
	public String getNo() {
		return no;
	}
	
	//�a���c���𒲂ׂ�
	public long getBalance() {
		return balance;
	}
	
	//���ʔԍ����擾
	public int getId() {
		return id;
	}
	
	//k�~�a����
	public void deposit(long k) {
		balance += k;
	}
	
	//k�~���낷
	public void withdraw(long k) {
		balance -= k;
	}
	
}
