package cn.jbit.pet;

/*
 * ������
 */
public abstract class Pet {
	// ����
	protected String name = "������";// �ǳ�
	protected int health = 0; // ����ֵ
	protected int love = 0;// ���ܶ�

	/**
	 * 1.��������������ͬ 2.�޷���ֵ 3.�������� 4.��ʼ������
	 */
	// alt+shift+s+c �޲�
	public Pet() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}

	// alt+shift+s+o �вι��캯��
	public Pet(String name) {
		this.name = name;
	}

	/**
	 * ����������Ϣ ����
	 */
	public void print() {
		System.out.println("������԰�:\n�ҵ����ֽ�" + this.name + ",����ֵ��" + this.health
				+ ",����һ�����ܶ���" + this.love + "��");
	}

	/**
	 * ���󷽷�eat(),�������Է�����
	 */
	public abstract void eat();// �г��󷽷�����һ���ǳ�����
	
	/**
	 * ���󷽷�zhiliao(),����������Ʒ���
	 */
	public abstract void zhiliao();//���Ʒ���
	
	
	
} // Dog Penguin strain sex
