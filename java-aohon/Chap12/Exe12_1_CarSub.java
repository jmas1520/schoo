
public class Exe12_1_CarSub extends Exe12_1_Car{
	private double totalMileage;
	
	//�R���X�g���N�^
	Exe12_1_CarSub(String name,int width,int height,int lenght,double fuel,
											Exe12_1_Day purchaseDay,double totalMileage){
		super(name,width,height,lenght,fuel,purchaseDay);
		this.totalMileage = totalMileage;
	}
	
	//�����s�����𒲂ׂ�
	public double getTotalMileage() {
		return totalMileage;
	}
	
	//�����s�����̌v�Z
	public void setTotalMileage(double dx,double dy) {
		double dist = Math.sqrt(dx*dx + dy*dy);
		totalMileage += dist;
	}
}
