package Chapter02.Simple02;

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
}
