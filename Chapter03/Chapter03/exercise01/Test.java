package Chapter03.exercise01;

public class Test {
	public static void main(String[] args) {

		Dog dog = new Dog("ŷŷ", "��������Ȯ");
		Cat cat = new Cat("С��", "Q��");
		Penguin pgn = new Penguin("��", "Q��");
		Master master = new Master("С��", 100);
		dog.print();
		master.feed(dog);
		cat.print();
		master.feed(cat);
		pgn.print();
		master.feed(pgn);
	}
}
