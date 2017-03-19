package Chapter03.Simple14;

public class Master {
	private String name = "";// ��������
	private int money = 0;// Ԫ����

	public Master(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}

	public void feed(Pet pet) {
		pet.eat();
	}

	public void feed(Dog dog) {
		dog.eat();
	}

	public void feed(Penguin pgn) {
		pgn.eat();
	}

	public Pet getpet(int typeId) {
		Pet pet = null;
		if (typeId == 1) {
			pet = new Dog("ŷŷ", "ѩ����");
		} else if (typeId == 2) {
			pet = new Penguin("��", "Q��");
		}
		return pet;
	}
}
