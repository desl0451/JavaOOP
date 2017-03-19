package Chapter02.Question05;

public class Fish extends Animal {
	private int weight;

	public Fish(int age, int weight) {
		super(age);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public Fish() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public void info() {
		System.out.println("����һֻ" + this.getWeight() + "���ص���");
		System.out.println("����" + this.getAge() + "����!");
	}

}
