package Chapter02.Question05;

public class Bird extends Animal {
	private String color;

	public String getColor() {
		return color;
	}

	public Bird() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bird(int age, String color) {
		super(age);
		this.color = color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void info() {
		System.out.println("����һֻ" + this.getColor() + "����");
		System.out.println("����" + this.getAge() + "����!");
	}

}
