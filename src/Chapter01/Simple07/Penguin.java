package Chapter01.Simple07;

public class Penguin {
	String name = "������";
	int health = 100;
	int love = 0;
	String sex = "Q��";// �Ա�

	public Penguin() {
		name="��";
		love=20;
		sex="Q��";
		System.out.println("ִ�й��췽��");
	}

	public void print() {
		System.out.println("������԰�:\n�ҵ����ֽ�" + this.name + ",����ֵ��" + this.health
				+ ",�����˵����ܶ���" + this.love + ",�Ա���" + this.sex + "��");
	}
	public static void main(String[] args) {
		Penguin pgn=null;
		pgn=new Penguin();
		pgn.print();
		
	}
}
