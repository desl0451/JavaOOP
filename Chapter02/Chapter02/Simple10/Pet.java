package Chapter02.Simple10;

public abstract class Pet {
	private String name = "������";
	private int health = 100;
	private int love = 0;

	public Pet(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println("������԰�:\n�ҵ����ֽ�" + this.name + ",����ֵ��" + this.health
				+ ",�����˵����ܶ���" + this.love + "��");
	}
}
