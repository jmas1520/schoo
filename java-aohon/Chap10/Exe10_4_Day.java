
import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

public class Exe10_4_Day {
	private int year = 1;
	private int month = 1;
	private int date = 1;
	
	public static boolean isLeap(int y) {
		return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
	}
	
	//�s���l�r��
	public static int CalDate(int year,int month,int date) {
		//�P�R�ȏ�Ȃ�P�Q���A�O�ȉ��Ȃ�P���Ɋr��
		int m = month;
		if(m > 12) {
			m = 12;
		}
		else if(m < 1) {
			m = 1;
		}
		
		//���̍ŏI���ȏ�Ȃ�ŏI���A�O�ȉ��Ȃ�P���Ɋr��
		int d = date;
		if(isLeap(year) && m == 2 && d > 29){
			d = 29;
		}
		else if(m == 2 && d > 28) {
			d = 28;
		}
		else if(d > 31 && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)) {
			d = 31;
		}
		else if(d > 30 && (m == 4 || m == 6 || m == 9 || m == 11)) {
			d = 30;
		}
		else if(d < 1){
			d = 1;
		}
		return d;
	}
	
	public static int CalMonth(int month) {
		//�P�R�ȏ�Ȃ�P�Q���A�O�ȉ��Ȃ�P���Ɋr��
		int m = month;
		if(m > 12) {
			m = 12;
		}
		else if(m < 1) {
			m = 1;
		}
		return m;
	}
	
	//�R���X�g���N�^
	public Exe10_4_Day() {
		GregorianCalendar today = new GregorianCalendar();
		this.year = today.get(YEAR);
		this.month = today.get(MONTH) + 1;
		this.date = today.get(DATE);
	}
	public Exe10_4_Day(int year) {
		this.year = year;
	}
	public Exe10_4_Day(int year,int month) {
		this(year);
		this.month = CalMonth(month);
	}
	public Exe10_4_Day(int year,int month,int date) {
		this(year);
		this.month = CalMonth(month);
		this.date = CalDate(year,month,date);
	}
	public Exe10_4_Day(Exe10_4_Day d) {
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
	
	public boolean isLeap() {
		return isLeap(year);
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
	public boolean equalTo(Exe10_4_Day d) {
		return year == d.year && month == d.month && date == d.date;
	}
	
	//������\����ԋp
	public String toString() {
		String[] wd = {"��","��","��","��","��","��","�y"};
		return String.format("%04d�N%02d��%02d��(%s)",year,month,date,wd[dayOfWeek()]);
	}
	
	//�N���̌o�ߓ���
	public int DateProgress() {
		int dp = 0,d = 0;
		if(isLeap(year)) {
			for(int i = 1; i < month; i++) {
				if(i == 2) {
					d = 29;
				}
				else if(i == 4 || i == 6 || i == 9 || i == 11) {
					d = 30;
				}
				else {
					d = 31;
				}
				dp += d;
			}
		}
		else {
			for(int i = 1; i < month; i++) {
				if(i == 2) {
					d = 28;
				}
				else if(i == 4 || i == 6 || i == 9 || i == 11) {
					d = 30;
				}
				else {
					d = 31;
				}
				dp += d;
			}
		}
		
		dp += date; 
		return dp;
	}
}
