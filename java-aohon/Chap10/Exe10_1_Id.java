
public class Exe10_1_Id {
	private static int counter = 0;
	private int id;
	
	//�R���X�g���N�^
	public Exe10_1_Id() {
		id = ++counter;
	}
	
	//���ʔԍ��擾
	public int getId() {
		return id;
	}
	
	//�Ō�̎��ʔԍ��擾
	public static int getMaxId() {
		return counter;
	}
}
