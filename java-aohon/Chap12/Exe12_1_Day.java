
public class Exe12_1_Day {
	private int year = 1;
	private int month = 1;
	private int date = 1;
	
	//�R���X�g���N�^
	public Exe12_1_Day() {}
	public Exe12_1_Day(int year) {
		this.year = year;
	}
	public Exe12_1_Day(int year,int month) {
		this(year);
		this.month = month;
	}
	public Exe12_1_Day(int year,int month,int date) {
		this(year,month);
		this.date = date;
	}
	public Exe12_1_Day(Exe12_1_Day d) {
		this(d.year,d.month,d.date);
	}
	
	//�N�����擾
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDate() {
		return date;
	}
	
	//�N�����ݒ�
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
	public void set(int year,int month,int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}	
	
	//�j�������߂�
	public int dayOfWeek() {
		int y = year;
		int m = month;
		if(m == 1 || m == 2) {
			y--;
			m += 12;
		}
		return (y + y/4 - y/100 + y/400 + (13 * m + 8)/5 + date) % 7;
	}
	
	//���td�Ɠ�������
	public boolean equalTo(Exe12_1_Day d) {
		return year == d.year && month == d.month && date == d.date;
	}
	
	//������\����ԋp
	public String toString() {
		String[] wd = {"��","��","��","��","��","��","�y"};
		return String.format("%04d�N%02d��%02d��(%s)",year,month,date,wd[dayOfWeek()]);
	}
	
}
