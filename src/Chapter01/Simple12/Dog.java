package Chapter01.Simple12;

class Dog {
	private String name = "������";
	private int health = 100;
	private int love = 0;
	private String strain = "��������������Ȯ";

	public Dog(String name, int health) {
		this.name = name;
		this.health = health;
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
		if (health > 100 || health < 0) {
			this.health = 40;
			System.out.println("����ֵӦ����0��100֮��,Ĭ��ֵ��40");
		} else {
			this.health = health;
		}
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	public void print() {
		System.out.println("������԰�:\n�ҵ����ֽ�" + this.name + ",����ֵ��" + this.health
				+ ",�����˵����ܶ���" + this.love + ",�Ա���" + this.strain + "��");
	}

	public void eat() {
		if (health >= 100) {
			System.out.println("������Ҫ���˶�ѽ!");
		} else {
			health = health + 3;
			System.out.println("�����Ա�����!");
		}
	}

	public void play() {
		if (health < 60) {
			System.out.println("����������!");
		} else {
			System.out.println("�������ں�������ˣ��");
			health = health - 10;
			love = love + 5;
		}
	}
	
}