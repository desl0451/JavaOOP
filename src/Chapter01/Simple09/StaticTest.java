package Chapter01.Simple09;

public class StaticTest {
	static int i;
	static int m = 30;
	int j;
	int k = 25;
	static {
		i = 10;
		System.out.println("i�ĳ�ʼ��ֵΪ:" + i);
	}

	public StaticTest() {
		j = 20;
		System.out.println("j�ĳ�ʼ��ֵΪ:" + j);
	}

	public static void getNum() {
		System.out.println("�õ�i��ֵΪ:" + i);
	}

	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		System.out.println("i��ֵΪ:"+StaticTest.i);
		st.getNum();
		System.out.println("m��ֵΪ:"+st.m);
		System.out.println("k��ֵΪ:"+st.k);
	}
}
