package Chapter01.Simple05;

public class Penguin {
	String name = "������";
	int health = 100;
	int love = 0;
	final String SEX_MALE = "Q��";
	final String SEX_FEMALE = "Q��";
	String sex = SEX_MALE;// �Ա�

	public void print() {
		System.out.println("������԰�:\n�ҵ����ֽ�" + this.name + ",����ֵ��" + this.health
				+ ",�����˵����ܶ���" + this.love + ",�Ա���" + this.sex + "��");
	}
}
