package Chapter02.Simple06;

public class Dog extends Pet {
	private String strain;// Ʒ��

	/**
	 * �вι��췽��
	 * 
	 * @param name�ǳ�
	 * @param strainƷ��
	 *            ��
	 */
	public Dog(String name, String strain) {
		super(name);
		this.strain = strain;
	}

	public String getStrain() {
		return strain;
	}

	/**
	 * ��д�����print()����
	 */
	public void print() {
		super.print();// ���ø����print()����
		System.out.println("����һֻ" + this.strain + "��");
	}
}
