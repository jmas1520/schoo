
public class Exe12_1_Car {
	private String name;
	private int width;
	private int height;
	private int lenght;
	private double x;
	private double y;
	private double fuel;
	private Exe12_1_Day purchaseDay;
	
	//�R���X�g���N�^
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
	
	//�Ԃ̌ʃf�[�^���o��
	public void putSpec() {
		System.out.println("���O �F " + name);
		System.out.println("�ԕ� �F " + width + "mm");
		System.out.println("�ԍ� �F " + height + "mm");
		System.out.println("�Ԓ� �F " + lenght + "mm");
	}
	
	//x������dx�EY������dy�ړ�
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
