package Chapter01.Simple08;

public class Penguin {
	String name = "������";
	int health = 100;
	int love = 0;
	String sex = "Q��";// �Ա�

	public Penguin() {
		name = "��";
		love = 20;
		sex = "Q��";
		System.out.println("ִ�й��췽��");
	}

	public Penguin(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}

	public Penguin(String name, int health, int love, String sex) {
		this.name = name;
		this.health = health;
		this.love = love;
		this.sex = sex;
	}

	public void print() {
		System.out.println("������԰�:\n�ҵ����ֽ�" + this.name + ",����ֵ��" + this.health
				+ ",�����˵����ܶ���" + this.love + ",�Ա���" + this.sex + "��");
	}

	public static void main(String[] args) {
		Penguin pgn = null;
		pgn = new Penguin();
		pgn.print();
		pgn = new Penguin("����", "���");
		pgn.print();
		pgn = new Penguin("����", 80, 20, "Q��");
		pgn.print();
	}
}
