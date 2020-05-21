
public class Exe8_2_Car {
	private String name;
	private String number;
	private int width;
	private int height;
	private int lenght;
	private double x;
	private double y;
	private double fuel;
	
	//�R���X�g���N�^
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
	
	//�Ԃ̌ʃf�[�^���o��
	void putSpec() {
		System.out.println("���O �F " + name);
		System.out.println("�i���o�[ �F " + number);
		System.out.println("�ԕ� �F " + width + "mm");
		System.out.println("�ԍ� �F " + height + "mm");
		System.out.println("�Ԓ� �F " + lenght + "mm");
	}
	
	//x������dx�EY������dy�ړ�
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
	
	//����
	double Refuel(double f) {
		fuel += f;
		return fuel;
	}
	
}
