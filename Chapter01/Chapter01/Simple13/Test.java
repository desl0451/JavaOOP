package Chapter01.Simple13;

public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog("ŷŷ", "����ѩ����");
		dog.play();
		System.out.println("����ֵ��:" + dog.getHealth());
		dog.eat();
		dog.print();
	}
}
