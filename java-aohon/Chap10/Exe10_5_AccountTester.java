
public class Exe10_5_AccountTester {
	public static void main(String[] args) {
		Exe10_5_Account adachi = new Exe10_5_Account("�����K��","123456",1000);
		
		System.out.println("�������N�̌���");
		System.out.println("�������` �F " + adachi.getName());
		System.out.println("�����ԍ� �F " + adachi.getNo());
		System.out.println("�a���c�� �F " + adachi.getBalance());
		System.out.println("���ʔԍ� �F " + adachi.getId());
		
		Exe10_5_Account nakata = new Exe10_5_Account("���c�^��","654321",200);
	
		System.out.println("�����c�N�̌���");
		System.out.println("�������` �F " + nakata.getName());
		System.out.println("�����ԍ� �F " + nakata.getNo());
		System.out.println("�a���c�� �F " + nakata.getBalance());
		System.out.println("���ʔԍ� �F " + nakata.getId());
	}
}
