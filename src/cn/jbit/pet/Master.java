package cn.jbit.pet;

/**
 * ������
 */
public class Master {
	private String name = "";// ����
	private int money = 0;// Ԫ����

	// alt+shift+s+o
	/**
	 * ���캯��
	 * 
	 * @param name
	 *            ������
	 * @param money
	 *            Ԫ����
	 */
	public Master(String name, int money) {
		this.name = name;
		this.money = money;
	}

	/**
	 * ιʳ����->��
	 */
	// public void feed(Dog dog) {
	// dog.eat();
	// }

	/**
	 * ιʳ����->���
	 */
	// public void feed(Penguin pgn) {
	// pgn.eat();
	// }

	/**
	 * ιʳ����->è
	 */
	// public void feed(Cat cat) {
	// cat.eat();
	// }

	// ʵ�ֶ�̬��һ�ַ���:�����������ø���
	/**
	 * ιʳ����
	 * 
	 * @param pet
	 */
	public void feed(Pet pet) {
		pet.eat();
	}

	// ���ࡡ����=new ����();//
	/**
	 * ���Ʒ���
	 * 
	 * @param pet
	 */
	public void ����(Pet pet) {
		pet.zhiliao();
	}

	/**
	 * �������﷽��
	 */
	// public ����ֵд���� ������(����){
	// ��
	// }
	public Pet getPet(String typeId) {
		// ����һ������???
		Pet pet = null;
		if (typeId.equals("1")) {
			pet = new Dog("ŷŷ", "��������Ȯ");
		} else if (typeId.equals("2")) {
			pet = new Penguin("����", "��");
		} else {
			pet = new Cat("С��", "��ɫ");
		}

		return pet;
	}

	public void play(Pet pet) {
		if (pet instanceof Dog) {
			Dog dog = (Dog) pet;
			dog.catchingFlyDisc();
		} else if (pet instanceof Penguin) {
			Penguin pgn = (Penguin) pet;
			pgn.swimming();
		} else if (pet instanceof Cat) {
			Cat cat = (Cat) pet;
			cat.shangshu();
		}
	}

}
