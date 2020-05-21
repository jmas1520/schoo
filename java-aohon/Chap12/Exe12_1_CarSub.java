
public class Exe12_1_CarSub extends Exe12_1_Car{
	private double totalMileage;
	
	//コンストラクタ
	Exe12_1_CarSub(String name,int width,int height,int lenght,double fuel,
											Exe12_1_Day purchaseDay,double totalMileage){
		super(name,width,height,lenght,fuel,purchaseDay);
		this.totalMileage = totalMileage;
	}
	
	//総走行距離を調べる
	public double getTotalMileage() {
		return totalMileage;
	}
	
	//総走行距離の計算
	public void setTotalMileage(double dx,double dy) {
		double dist = Math.sqrt(dx*dx + dy*dy);
		totalMileage += dist;
	}
}
