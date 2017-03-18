package Chapter02.exercise01;

public class Dog extends Pet {
	private String strain;

	public String getStrain() {
		return strain;
	}

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, String strain) {
		super(name);
		this.strain = strain;
	}

	public Dog(String name, int health, int love, String strain) {
		super(name, health, love);
		this.strain = strain;
	}
	@Override
	public void print() {
		System.out.println("������԰�:\n�ҵ����ֽ�" + this.getName() + ",����ֵ��"
				+ this.getHealth() + ",�����˵����ܶ���" + this.getLove() + "��");
		System.out.println("������Ʒ��" + this.getStrain());
	}
}
