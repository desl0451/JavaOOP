package Chapter02.Question06;

/**
 * ����
 */
public abstract class Fowl {
	/**
	 * ����
	 */
	private String name;
	/**
	 * ����
	 */
	private String breed;

	public Fowl() {
		super();
	}

	/**
	 * ��
	 * 
	 * @param food
	 */
	public void eat(String food) {
		System.out.println("��ϲ����" + food);
	}

	public Fowl(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public abstract void showInfo();
}
