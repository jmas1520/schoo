
public class Exe10_1_IdTester {
	public static void main(String[] args) {
		Exe10_1_Id a = new Exe10_1_Id();
		Exe10_1_Id b = new Exe10_1_Id();
		
		System.out.println("aの識別番号 ： " + a.getId());
		System.out.println("bの識別番号 ： " + b.getId());
		
		System.out.println("最後に与えた識別番号 ： " + Exe10_1_Id.getMaxId());
	}
}
