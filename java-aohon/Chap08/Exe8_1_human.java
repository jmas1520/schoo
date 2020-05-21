
public class Exe8_1_human {
	private String name;
	private int age;
	private double height;
	private double weight;
	private double bmi;
	
	//コンストラクタ
	Exe8_1_human(String name, int age, double height,double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		bmi = 0.0;
	}
	
	//入力された個別データを出力
	void putSpec() {
		System.out.println("名前 ： " + name);
		System.out.println("年齢 ： " + age + "歳");
		System.out.println("身長 ： " + height + "cm");
		System.out.println("体重 ： " + weight + "kg");
	}
	
	//BMIの計算
	double getBmi (double weight,double height) {
		bmi = weight / (height/100) / (height/100);
		return bmi;
	}

}