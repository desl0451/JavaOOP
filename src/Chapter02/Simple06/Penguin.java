package Chapter02.Simple06;

import Chapter02.Simple02.Pet;

public class Penguin extends Pet {
	private String sex;// �Ա�

	public Penguin(String name, String sex) {
		super(name);
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	/**
	 * ��д�����print()����
	 */
	public void print() {
		super.print();
		System.out.println("�Ա���" + this.sex + "��");
	}
}