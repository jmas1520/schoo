
public class Exe10_1_IdTester {
	public static void main(String[] args) {
		Exe10_1_Id a = new Exe10_1_Id();
		Exe10_1_Id b = new Exe10_1_Id();
		
		System.out.println("a�̎��ʔԍ� �F " + a.getId());
		System.out.println("b�̎��ʔԍ� �F " + b.getId());
		
		System.out.println("�Ō�ɗ^�������ʔԍ� �F " + Exe10_1_Id.getMaxId());
	}
}
