package Chapter03.Simple10;

public class Dog extends Pet {
	private String strain;// Ʒ��

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, String strain) {
		super(name);
		this.strain = strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	public String getStrain() {
		return strain;
	}

	/**
	 * ��д�����print()����
	 */
	@Override
	public void print() {
		super.print();
		System.out.println("����һֻ"+this.strain+"��");
	}
	/**
	 * ʵ�ֹ����Է��ķ���
	 */	
	@Override
	public void eat() {
		super.health=super.health+3;
		System.out.println("����"+super.name+"�Ա���!����ֵ����3.");
	}
}
