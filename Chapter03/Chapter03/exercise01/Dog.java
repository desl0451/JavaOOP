package Chapter03.exercise01;

public class Dog extends Pet {
	/**
	 * Ʒ��
	 */
	private String strain;

	public Dog() {
		super();
	}

	public Dog(String name, String strain) {
		super(name);
		this.strain = strain;
	}

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	@Override
	public void eat() {
		if (this.health > 100) {
			System.out.println("����" + this.getName() + "�Ա��ˣ�����Ҫιʳ�ˣ�");
		} else {
			this.setHealth(this.getHealth() + 3);
			System.out.println("����ֵ����3");
		}
	}
}
