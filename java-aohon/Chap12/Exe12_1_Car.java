
public class Exe12_1_Car {
	private String name;
	private int width;
	private int height;
	private int lenght;
	private double x;
	private double y;
	private double fuel;
	private Exe12_1_Day purchaseDay;
	
	//コンストラクタ
	public Exe12_1_Car (String name,int width,int height,int lenght,double fuel,Exe12_1_Day purchaseDay){
		this.name = name;
		this.width = width; 
		this.height = height;
		this.lenght = lenght;
		this.fuel = fuel;
		x = y = 0.0;
		this.purchaseDay = new Exe12_1_Day(purchaseDay);
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getFuel() {
		return fuel;
	}
	
	public Exe12_1_Day getPurchaseDay() {
		return new Exe12_1_Day(purchaseDay);
	}
	
	//車の個別データを出力
	public void putSpec() {
		System.out.println("名前 ： " + name);
		System.out.println("車幅 ： " + width + "mm");
		System.out.println("車高 ： " + height + "mm");
		System.out.println("車長 ： " + lenght + "mm");
	}
	
	//x方向にdx・Y方向にdy移動
	public boolean move(double dx,double dy) {
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
	
}
