package Chapter03.exercise01;

public class Master {
	private String name = "";// ��������
	private int money = 0; // Ԫ����

	public Master() {
	}

	public Master(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void feed(Pet pet) {
		pet.eat();
	}
}
