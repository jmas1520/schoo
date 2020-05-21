
public class Exe8_2_Car {
	private String name;
	private String number;
	private int width;
	private int height;
	private int lenght;
	private double x;
	private double y;
	private double fuel;
	
	//コンストラクタ
	Exe8_2_Car(String name,String number,int width,int height,int lenght,double fuel){
		this.name = name;
		this.number = number;
		this.width = width;
		this.height = height;
		this.lenght = lenght;
		this.fuel = fuel;
		x = y = 0.0;
	}
	
	double getX() {
		return x;
	}
	
	double getY() {
		return y;
	}
	
	double getFuel() {
		return fuel;
	}
	
	//車の個別データを出力
	void putSpec() {
		System.out.println("名前 ： " + name);
		System.out.println("ナンバー ： " + number);
		System.out.println("車幅 ： " + width + "mm");
		System.out.println("車高 ： " + height + "mm");
		System.out.println("車長 ： " + lenght + "mm");
	}
	
	//x方向にdx・Y方向にdy移動
	boolean move(double dx,double dy) {
		double dist = Math.sqrt(dx*dx + dy*dy);
		
		if(dist > fuel) {
			return false;
		}
		else {
			fuel -= dist;
			x += dx;
			y += dy;
			return true;
		}
	}
	
	//給油
	double Refuel(double f) {
		fuel += f;
		return fuel;
	}
	
}
