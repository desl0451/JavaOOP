package Chapter02.Question06;

public class Duck extends Fowl {

	public Duck(String name, String breed) {
		super(name, breed);
	}

	@Override
	public void showInfo() {
		System.out.println("�ҽ�"+this.getName()+"��һֻ"+this.getBreed());
	}

	public void swimming() {
		System.out.println("�һ���Ӿ��");
	}
}
