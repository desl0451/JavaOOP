package Chapter03.Simple09;

public class Test {
	public static void main(String[] args) {
		Master master = new Master("������", 100);
		// Pet dog = new Dog("ŷŷ", "ѩ����");
		// Pet pgn = new Penguin("��", "Q��");
		Pet cat = new Cat("����", "��ɫ");
		// master.feed(dog);
		// master.feed(pgn);
		master.feed(cat);
	}
}
