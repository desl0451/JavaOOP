package Chapter03.Question06;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "ţ��";// input.next();
		Master master = new Master(name);
		Chinese chinese = new Chinese("�й�", "��Сǿ");
		American america = new American("����", "Լ��");
		master.serving(chinese);
		master.serving(america);

	}

}
