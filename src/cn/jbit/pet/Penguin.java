package cn.jbit.pet;

public class Penguin extends Pet {
	// ����
	private String sex;

	// ���캯��
	public Penguin(String name, String sex) {
		super(name);
		this.sex = sex;
	}

	// ��д����print()����
	@Override
	public void print() {
		super.print();
		System.out.println("������Ա�:" + this.sex);
	}

	// ��д���󷽷�
	@Override
	public void eat() {
		super.health = super.health + 5;
		System.out.println("���" + super.name + "�Ա���!����ֵ����5");
	}
	@Override
	public void zhiliao() {
		super.health = super.health + 50;
		if (super.health > 100) {
			super.health = 100;
		}
		System.out.println("����ֵ����50��");
	}
	/**
	 * ��Ӿ����   swimming()
	 */
	public void swimming() {
		System.out.println("��Ӿ....");
		super.health -= 20;
		super.love += 10;
	}
}
