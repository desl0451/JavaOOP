package Chapter03.exercise01;

public class Cat extends Pet {
	private String color;// ��ɫ

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Cat(String name, String color) {
		super(name);
		this.color = color;
	}

	@Override
	public void eat() {
		if (this.health > 100) {
			System.out.println("èè" + this.getName() + "�Ա��ˣ�����Ҫιʳ�ˣ�");
		} else {
			this.setHealth(this.getHealth() + 4);
			System.out.println("����ֵ����4");
		}
	}
}
