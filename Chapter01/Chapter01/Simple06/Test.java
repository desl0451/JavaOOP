package Chapter01.Simple06;

public class Test {
	public static void main(String[] args) {
		Penguin pgn=new Penguin();
		System.out.println("��һ�������Ա���:"+pgn.sex+".");
		pgn=new Penguin();
		pgn.sex=pgn.SEX_FEMALE;
		System.out.println("�ڶ��������Ա���:"+pgn.sex+".");
		pgn.sex=pgn.SEX_MALE;
		System.out.println("�����������Ա���:"+pgn.sex+".");

	}
}
