package Chapter03.Simple12;

public class Cat extends Pet {
	private String color;// ��ɫ

	public Cat(String name, String color) {
		super(name);
		this.color = color;
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.health = super.health + 4;
		System.out.println("è��" + super.name + "�Ա���!����ֵ����4��");
	}
}
