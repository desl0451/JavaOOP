package cn.jbit.pet;

public class Dog extends Pet {
	/**
	 * Ʒ��
	 */
	private String strain;

	/**
	 * ���캯��
	 * 
	 * @param name
	 *            ��������
	 * @param strain
	 *            Ʒ�� 1.���ù��캯�� super(XXX) 2.���ø�������� super.health 3.���ø���ķ���
	 *            super.print();
	 */
	public Dog(String name, String strain) {
		super(name);
		this.strain = strain;
	}

	/**
	 * ��д���෽�� 1.��ݼ� alt+shift+s+v 2.��д
	 */
	@Override
	public void print() {
		super.print();// 3.���ø���ķ���
		System.out.println("�����Ʒ�֣�" + this.strain);
	}

	/**
	 * �Է��� ��д 1.��������ͬ 2.�����б���ͬ 3.����ֵ������ͬ���������� 4.��д����������С����д�����ķ���Ȩ��
	 */
	@Override
	public void eat() {
		super.health = super.health + 3;
		System.out.println("����" + super.name + "�Ա���!����ֵ����3");
	}

	/**
	 * ���Ʒ���
	 */
	@Override
	public void zhiliao() {
		super.health = super.health + 40;
		if (super.health > 100) {
			super.health = 100;
		}
		System.out.println("����ֵ����40��");
	}
	/**
	 * �ӷ��̷���   
	 */
	public void catchingFlyDisc() {
		System.out.println("�ӷ���....");
		super.health -= 10;
		super.love += 5;
	}
}
