package Chapter03.Simple06;

public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog("ŷŷ", "ѩ����");
		Penguin pgn = new Penguin("��", "Q��");
		Master master = new Master("������", 100);
		master.feed(dog);
		master.feed(pgn);
	}
}
