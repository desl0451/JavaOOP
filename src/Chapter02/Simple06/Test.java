package Chapter02.Simple06;

public class Test {
	public static void main(String[] args) {
		// 1.�����������Pet�������Ϣ
		Pet pet = new Pet("����");
		pet.print();
		System.out.println("======================================");
		// 2.������������dog�������Ϣ
		Dog dog = new Dog("ŷŷ", "ѩ����");
		dog.print();
		System.out.println("======================================");
		// 3.����������pgn�������Ϣ
		Penguin pgn = new Penguin("��", "Q��");
		pgn.print();
	}
}
