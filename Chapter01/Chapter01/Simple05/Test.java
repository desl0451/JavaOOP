package Chapter01.Simple05;

public class Test {
	public static void main(String[] args) {
		//ϵͳĬ�ϻ����һ���޲������� �������޲������츳ֵ
		Penguin pgn=new Penguin();
		System.out.println("��һ�������Ա���:"+pgn.sex+".");
		pgn=new Penguin();
		pgn.sex=pgn.SEX_FEMALE;
		System.out.println("�ڶ��������Ա���:"+pgn.sex+".");
		pgn.sex=pgn.SEX_MALE;
		System.out.println("�����������Ա���:"+pgn.sex+".");

	}
}
