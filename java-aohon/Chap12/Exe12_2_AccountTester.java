
public class Exe12_2_AccountTester {
	public static void main(String[] args) {
		Exe12_2_Account adachi = new Exe12_2_Account("�����K��","123456",1000);
		Exe12_2_AccountSub nakata = new Exe12_2_AccountSub("���c�^��","654321",700,300);
		
		switch(Exe12_2_AccountSub.compBalance(adachi,nakata)) {
		case 0 : System.out.println("�����N�ƒ��c�N�̗a���c���̍��v�z�i���ʁA����j�͓����B");
			break;
		case 1 : System.out.println("�����N�̕����a���c���̍��v�z�i���ʁA����j�������B");
			break;
		case -1 : System.out.println("���c�N�̕����a���c���̍��v�z�i���ʁA����j�������B");
			break;
		}
		
		Exe12_2_Account suzuki = new Exe12_2_Account("��ؒq","123456",1000);
		Exe12_2_Account takahasi = new Exe12_2_Account("�����Ǒ�","654321",800);
		
		switch(Exe12_2_AccountSub.compBalance(suzuki,takahasi)) {
		case 0 : System.out.println("��،N�ƍ����N�̗a���c���̍��v�z�i���ʁA����j�͓����B");
			break;
		case 1 : System.out.println("��،N�̕����a���c���̍��v�z�i���ʁA����j�������B");
			break;
		case -1 : System.out.println("�����N�̕����a���c���̍��v�z�i���ʁA����j�������B");
			break;
		}
		
		Exe12_2_AccountSub watanabe = new Exe12_2_AccountSub("�n�ӏr��","123456",1000,1000);
		Exe12_2_AccountSub tanaka = new Exe12_2_AccountSub("�c���N�P","654321",1200,800);
		
		switch(Exe12_2_AccountSub.compBalance(watanabe,tanaka)) {
		case 0 : System.out.println("�n�ӌN�Ɠc���N�̗a���c���̍��v�z�i���ʁA����j�͓����B");
			break;
		case 1 : System.out.println("�n�ӌN�̕����a���c���̍��v�z�i���ʁA����j�������B");
			break;
		case -1 : System.out.println("�c���N�̕����a���c���̍��v�z�i���ʁA����j�������B");
			break;
		}
	}
}
