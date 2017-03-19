package Chapter03.exercise02;

public class Master {
	private String name = "";// ��������
	private int money = 0;// Ԫ����

	public Master(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}

	/**
	 * ����ιʳ
	 */
	public void feed(Pet pet) {
		pet.eat();
	}

	public void play(Pet pet) {
		if (pet instanceof Dog) {
			Dog dog = (Dog) pet;
			dog.catchingFlyDisc();
		} else if (pet instanceof Penguin) {
			Penguin pgn = (Penguin) pet;
			pgn.swimming();
		}
	}

	public Pet getPet(int typeId) {
		Pet pet = null;
		if (typeId == 1) {
			pet = new Dog("ŷŷ", "����");
		} else if (typeId == 2) {
			pet = new Penguin("С����", "Q��");
		}
		return pet;
	}

}
