package Chapter02.Question06;

public class Test {
	public static void main(String[] args) {
		Chook luhuaji = new Chook("��", "«����");
		luhuaji.showInfo();
		luhuaji.eat("����");
		luhuaji.ding();
		System.out.println("--------------------");
		Duck banzuiya = new Duck("�¸�", "����Ѽ");
		banzuiya.showInfo();
		banzuiya.eat("С��Ϻ");
		banzuiya.swimming();
	}
}
