
public class Exe10_2_ExId {
	private static int counter = 0;
	private int id;
	
	//�R���X�g���N�^
	public Exe10_2_ExId(int dis,int n) {
		if(dis == 1) {
			counter += n;
			id = counter;
		}
		else {
			id = ++counter;
		}
	}
	
	//���ʔԍ��擾
	public int getExId() {
		return id;
	}
	
	//�Ō�̎��ʔԍ��擾
	public static int getMaxExId() {
		return counter;
	}
}
