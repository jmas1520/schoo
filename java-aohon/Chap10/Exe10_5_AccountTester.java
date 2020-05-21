
public class Exe10_5_AccountTester {
	public static void main(String[] args) {
		Exe10_5_Account adachi = new Exe10_5_Account("足立幸一","123456",1000);
		
		System.out.println("■足立君の口座");
		System.out.println("口座名義 ： " + adachi.getName());
		System.out.println("口座番号 ： " + adachi.getNo());
		System.out.println("預金残高 ： " + adachi.getBalance());
		System.out.println("識別番号 ： " + adachi.getId());
		
		Exe10_5_Account nakata = new Exe10_5_Account("仲田真二","654321",200);
	
		System.out.println("■仲田君の口座");
		System.out.println("口座名義 ： " + nakata.getName());
		System.out.println("口座番号 ： " + nakata.getNo());
		System.out.println("預金残高 ： " + nakata.getBalance());
		System.out.println("識別番号 ： " + nakata.getId());
	}
}
