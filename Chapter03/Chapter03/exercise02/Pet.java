package Chapter03.exercise02;

public abstract class Pet {
	protected String name = "������";// �ǳ�
	protected int health = 100;// ����ֵ
	protected int love = 0;// ���ܶ�

	public Pet() {
		super();
	}

	public Pet(String name) {
		super();
		this.name = name;
	}

	public Pet(String name, int health, int love) {
		super();
		this.name = name;
		this.health = health;
		this.love = love;
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

	/**
	 * ���������Ϣ
	 */
	public void print() {
		System.out.println("������԰�:\n�ҵ����ֽ�" + this.name + ",����ֵ��" + this.health
				+ ",�����˵����ܶ���" + this.love + "��");
	}

	/**
	 * ���󷽷�eat(),�������Է�����
	 */
	public abstract void eat();

}
