package Chapter01.exercise03;

/**
 * ��������࣬ʹ�þ�̬������
 */
public class Penguin {
	String name = "������"; // �ǳ�
	int health = 100; // ����ֵ
	int love = 20; // ���ܶ�
	// static final String SEX_MALE ="Q��";
	// static final String SEX_FEMALE="Q��";
	static final String SEX_MALE = "��";
	static final String SEX_FEMALE = "��";
	String sex = ""; // �Ա�

	/**
	 * �޲������죺 
	 * 1������������ͬ�� 
	 * 2��û�з���ֵ 
	 * 3���뷵�ص����η��޹� 
	 * ���ã�����Ա����Ĭ�ϸ����ʼֵ
	 */
	public Penguin() {
		name = "������";
		health = 100;
		love = 10;

	}
	 /**
     * ע��:���������ͳ�Ա����ͬ��������ʹ��this����Ա����ָ�� 
     *  this�����еĶ��� 
     * @param name
     * @param health
     * @param love
     * @param sex
     */
	public Penguin(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}

	/**
	 * ���������Ϣ��
	 */
	public void print() {
		System.out.println("������԰ף�\n�ҵ����ֽ�" + this.name + "������ֵ��" + this.health
				+ "�������˵����ܶ���" + this.love + "���Ա��� " + this.sex + "��");
	}
}
