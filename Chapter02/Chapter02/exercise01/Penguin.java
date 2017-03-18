package Chapter02.exercise01;

public class Penguin extends Pet {
	private String sex;

	public String getSex() {
		return sex;
	}

	public Penguin(String name, String sex) {
		super(name);
		this.sex = sex;
	}

	public Penguin(String name, int health, int love, String sex) {
		super(name, health, love);
		this.sex = sex;
	}

	public Penguin() {
		super();
	}

	@Override
	public void print() {
		System.out.println("������԰�:\n�ҵ����ֽ�" + this.getName() + ",����ֵ��"
				+ this.getHealth() + ",�����˵����ܶ���" + this.getLove() + "��");
		System.out.println("�����Ա�" + this.getSex());
	}
}
