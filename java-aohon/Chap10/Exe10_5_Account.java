
public class Exe10_5_Account {
	private static int counter = 0;
	private String name;
	private String no;
	private long balance;
	private int id;
	
	//�C���X�^���X�������q
	{
		System.out.println("������s�ł̌����J�݂��肪�Ƃ��������܂��B");
	}
	
	//�R���X�g���N�^
	public Exe10_5_Account(String n,String num,long z) {
		name = n;
		no = num;
		balance = z;
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
