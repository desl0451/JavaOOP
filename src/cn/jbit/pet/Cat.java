package cn.jbit.pet;

public class Cat extends Pet {
	private String color;

	public Cat(String name, String color) {
		super(name);
		this.color = color;
	}

	@Override
	public void eat() {
		super.health = super.health + 4;
		System.out.println("èè" + this.name + "�Ա���.!����ֵ����4");
	}

	@Override
	public void print() {
		super.print();
		System.out.println("��ɫ" + this.color);
	}

	// 1.��ݼ�alt+shift+s+v

	@Override
	public void zhiliao() {
		super.health = super.health + 30;
		if (super.health > 100) {
			super.health = 100;
		}
		System.out.println("����ֵ����30��");
	}

	/**
	 * ��������
	 */
	public void shangshu() {
		System.out.println(" ����....");
		super.health -= 4;
		super.love += 5;
	}
}
