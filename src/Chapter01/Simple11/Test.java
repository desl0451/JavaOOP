package Chapter01.Simple11;

public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setHealth(300);
		dog.setName("ŷŷ");
		dog.setHealth(300);
		System.out.println("�ǳ���:" + dog.getName());
		System.out.println("����ֵ��:" + dog.getHealth());
		dog.print();
	}

}
