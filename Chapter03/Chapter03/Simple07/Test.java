package Chapter03.Simple07;

public class Test {
	public static void main(String[] args) {
		Master master = new Master("������", 100);
		Pet dog = new Dog("ŷŷ", "ѩ����");
		Pet pgn = new Penguin("��", "Q��");
		master.feed(dog);
		master.feed(pgn);
	}
}
