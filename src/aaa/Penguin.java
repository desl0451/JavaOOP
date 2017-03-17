package aaa;
/**
 * 企鹅类，宠物的子类。
 */
public class Penguin extends Pet {
	private String sex;// 性别
	/**
	 * 有参构造方法。
	 * @param name 昵称
	 * @param sex 性别
	 */
	public Penguin(String name, String sex) {
		super(name);
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * 重写父类的print方法
	 */
	public void print() {
		super.print();
		System.out.println("性别是 " + this.sex + "。");
	}
}
