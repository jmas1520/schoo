
//演習2-1

class Exe2_1{
	public static void main(String[] args){
		int x;
		int y;
		
		x = 63.4;
		y = 18.8;
		
		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("合計は" + (x+y) + "です。");
		System.out.println("平均は" + (x+y)/2 + "です。");
	}
}

/*考察
エラーメッセージが出た。整数を定義するintで小数を変数に代入してしまっているから小数点以下が失われてしまう警告が出ていると考えられる。
*/



