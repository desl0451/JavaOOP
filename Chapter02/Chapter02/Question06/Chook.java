package Chapter02.Question06;

public class Chook extends Fowl {

	public Chook(String name, String breed) {
		super(name, breed);
	}

	@Override
	public void showInfo() {
		System.out.println("�ҽ�" + this.getName() + "��һֻ" + this.getBreed());
	}

	public void ding() {
		System.out.println("�һ������");
	}
}
