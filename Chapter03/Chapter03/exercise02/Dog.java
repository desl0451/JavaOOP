package Chapter03.exercise02;

public class Dog extends Pet {
	private String strain;// Ʒ��

	public Dog(String name, String strain) {
		super(name);
		this.strain = strain;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("����һֻ" + this.strain + "��");
	}

	@Override
	public void eat() {
		super.health = super.health + 3;
		System.out.println("����" + super.name + "�Ա���!����ֵ����3");
	}

	public void catchingFlyDisc() {
		System.out.println("���˺͹�����ӷ�����Ϸ");
		super.health = super.health - 10;
		super.love = super.love + 5;
	}
}
