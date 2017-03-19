package Chapter03.exercise02;

public class Penguin extends Pet {
	private String sex;

	@Override
	public void print() {
		super.print();
		System.out.println("�Ա���" + this.sex + "��");
	}

	public Penguin(String name, String sex) {
		super(name);
		this.sex = sex;
	}

	@Override
	public void eat() {
		super.health = super.health + 5;
		System.out.println("���" + super.name + "�Ա���!����ֵ����5��");
	}

	public void swimming() {
		System.out.println("���˺��������Ӿ��Ϸ");
		super.health = super.health - 10;
		super.love = super.love + 5;
	}
}
