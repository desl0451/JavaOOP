package Chapter04.exercise01;

public class TheftproofDoor extends Door implements Lock, DoorBell {
	/**
	 * ����
	 */
	@Override
	public void takePictures() {
		// TODO Auto-generated method stub
		System.out.println("��.....����.....��Ƭ�洢");
	}

	/**
	 * ����
	 */
	@Override
	public void lockUp() {
		// TODO Auto-generated method stub
		System.out.println("���Կ��,������תԿ����Ȧ,�����ˣ��γ�Կ��.");
	}

	/**
	 * ����
	 */
	@Override
	public void openLock() {
		// TODO Auto-generated method stub
		System.out.println("���Կ��,������תԿ����Ȧ,������,�γ�Կ��");
	}

	/**
	 * ��
	 */
	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("�������Ŵ���.");
	}

	/**
	 * ��
	 */
	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("�ᾢ����,�Ź�����.");
	}

}
