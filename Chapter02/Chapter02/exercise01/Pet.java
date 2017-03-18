package Chapter02.exercise01;

public abstract class Pet {
	private String name = "������";// �ǳ�
	private int health = 100;// ����ֵ
	private int love = 0;// ���ܶ�

	public Pet() {

	}

	public Pet(String name) {
		super();
		this.name = name;
	}

	public Pet(String name, int health, int love) {
		this.name = name;
		this.health = health;
		this.love = love;
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public int getLove() {
		return love;
	}

	public abstract void print();
}
