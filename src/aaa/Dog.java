package aaa;

/**
 * �����࣬��������ࡣ
 */
public class Dog extends Pet {
	private String strain;// Ʒ��
	/**
	 * �вι��췽����
	 * @param name   �ǳ�
	 * @param strain   Ʒ��
	 */
	public Dog(String name, String strain) {
		//super(name); //�˴�����ʹ��this.name=name;
		this.strain = strain;
	}
	public String getStrain() {
		return strain;
	}
	/**
	 * ��д�����print������
	 */
	public void print(){
		super.print(); //���ø����print����
		System.out.println("����һֻ " + this.strain + "��");
	}
}
