package Chapter02.Simple04;

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
}
