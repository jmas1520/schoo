
public class Exe8_1_human {
	private String name;
	private int age;
	private double height;
	private double weight;
	private double bmi;
	
	//�R���X�g���N�^
	Exe8_1_human(String name, int age, double height,double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		bmi = 0.0;
	}
	
	//���͂��ꂽ�ʃf�[�^���o��
	void putSpec() {
		System.out.println("���O �F " + name);
		System.out.println("�N�� �F " + age + "��");
		System.out.println("�g�� �F " + height + "cm");
		System.out.println("�̏d �F " + weight + "kg");
	}
	
	//BMI�̌v�Z
	double getBmi (double weight,double height) {
		bmi = weight / (height/100) / (height/100);
		return bmi;
	}

}