package Chapter04.Simple10;

public class TheftproofDoor extends Door implements Lock, DoorBell {

	@Override
	public void takePictures() {
		System.out.println("��......����.....��Ƭ�Ѵ洢");
	}

	@Override
	public void lockUp() {
		System.out.println("���Կ��,������תԿ����Ȧ,������,�γ�Կ�ס�");
	}

	@Override
	public void openLock() {
		System.out.println("���Կ�ף�������תԿ����Ȧ,������,�γ�Կ�ס�");
	}

	@Override
	public void open() {
		System.out.println("������,�Ŵ��ˡ�");
	}

	@Override
	public void close() {
		System.out.println("��������,�Ź����ˡ�");
	}

}
