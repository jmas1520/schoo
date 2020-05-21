
public class Exe12_2_AccountTester {
	public static void main(String[] args) {
		Exe12_2_Account adachi = new Exe12_2_Account("足立幸一","123456",1000);
		Exe12_2_AccountSub nakata = new Exe12_2_AccountSub("仲田真二","654321",700,300);
		
		switch(Exe12_2_AccountSub.compBalance(adachi,nakata)) {
		case 0 : System.out.println("足立君と仲田君の預金残高の合計額（普通、定期）は同じ。");
			break;
		case 1 : System.out.println("足立君の方が預金残高の合計額（普通、定期）が多い。");
			break;
		case -1 : System.out.println("仲田君の方が預金残高の合計額（普通、定期）が多い。");
			break;
		}
		
		Exe12_2_Account suzuki = new Exe12_2_Account("鈴木智","123456",1000);
		Exe12_2_Account takahasi = new Exe12_2_Account("高橋良太","654321",800);
		
		switch(Exe12_2_AccountSub.compBalance(suzuki,takahasi)) {
		case 0 : System.out.println("鈴木君と高橋君の預金残高の合計額（普通、定期）は同じ。");
			break;
		case 1 : System.out.println("鈴木君の方が預金残高の合計額（普通、定期）が多い。");
			break;
		case -1 : System.out.println("高橋君の方が預金残高の合計額（普通、定期）が多い。");
			break;
		}
		
		Exe12_2_AccountSub watanabe = new Exe12_2_AccountSub("渡辺俊介","123456",1000,1000);
		Exe12_2_AccountSub tanaka = new Exe12_2_AccountSub("田中康輝","654321",1200,800);
		
		switch(Exe12_2_AccountSub.compBalance(watanabe,tanaka)) {
		case 0 : System.out.println("渡辺君と田中君の預金残高の合計額（普通、定期）は同じ。");
			break;
		case 1 : System.out.println("渡辺君の方が預金残高の合計額（普通、定期）が多い。");
			break;
		case -1 : System.out.println("田中君の方が預金残高の合計額（普通、定期）が多い。");
			break;
		}
	}
}
