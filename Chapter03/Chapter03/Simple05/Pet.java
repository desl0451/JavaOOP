package Chapter03.Simple05;

/**
 * ������,���������ĸ���
 */
public abstract class Pet {
	protected String name = "������";// �ǳ�
	protected int health = 100;// ����ֵ
	protected int love = 0;// ���ܶ�

	public Pet() {

	}

	public Pet(String name) {
		this.name = name;
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

	public void print() {
		System.out.println("������԰�:\n�ҵ����ֽ�" + this.name + ",�ҵĽ���ֵ��"
				+ this.health + ",�Һ����˵����̶ܳ���" + this.love + "��");
	}

	/**
	 * ���󷽷�eat(),�������Է�����
	 */
	public abstract void eat();
}
