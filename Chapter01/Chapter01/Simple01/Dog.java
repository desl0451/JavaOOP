package Chapter01.Simple01;

public class Dog {
	String name = "������";// �ǳ�
	int health = 100; // ����ֵ
	int love = 0; // ���ܶ�
	String strain = "��������������Ȯ";// Ʒ��

	public void print() {
		System.out.println("������԰�:\n�ҵ����ֽ�" + this.name + ",����ֵ��" + this.health
				+ ",�����˵����ܶ���" + this.love + ",����һֻ" + this.strain + "��");
	}
}
