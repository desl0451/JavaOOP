package Chapter02.Simple08;

public class Person {
	String name;// ����

	public Person() {
		// super();//��û�и���䣬Ч����һ��
		System.out.println("execute Person()");
	}

	public Person(String name) {
		this.name = name;
		System.out.println("execute Person(name)");
	}
}
