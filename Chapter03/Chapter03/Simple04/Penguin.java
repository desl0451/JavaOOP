package Chapter03.Simple04;

public class Penguin extends Pet {
	private String sex;// �Ա�

	public Penguin(String name, String sex) {
		super(name);
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("�Ա���:" + this.sex + "��");
	}

	@Override
	public void eat() {
		super.health = super.health + 5;
		System.out.println("���" + super.name + "�Ա���!����ֵ����5��");
	}
}
