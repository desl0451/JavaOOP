package Chapter02.Simple05;

public class Test {
	public static void main(String[] args) {
		// 1.�����������Pet�������Ϣ
		Pet pet = new Pet("����");
		pet.print();
		// 2.������������dog�������Ϣ
		Dog dog = new Dog("ŷŷ", "ѩ����");
		dog.print();
		// 3.����������pgn�������Ϣ
		Penguin pgn = new Penguin("��", "Q��");
		pgn.print();
	}
}
