package Chapter02.Simple01;

public class Pet {
	private String name = "������";// �ǳ�
	private int health = 100;// ����ֵ
	private int love = 0;// ���ܶ�

	/**
	 * �޲ι��췽��
	 */
	public Pet() {
		this.health = 95;
		System.out.println("ִ�г�����޲ι��췽����");
	}
	/**
	 * �вι��췽��
	 * @param name
	 */
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
}
