package cn.jbit.pet;

public class Penguin extends Pet {
	// 属性
	private String sex;

	// 构造函数
	public Penguin(String name, String sex) {
		super(name);
		this.sex = sex;
	}

	// 重写父类print()方法
	@Override
	public void print() {
		super.print();
		System.out.println("宠物的性别:" + this.sex);
	}

	// 重写抽象方法
	@Override
	public void eat() {
		super.health = super.health + 5;
		System.out.println("企鹅" + super.name + "吃饱了!健康值增加5");
	}
	@Override
	public void zhiliao() {
		super.health = super.health + 50;
		if (super.health > 100) {
			super.health = 100;
		}
		System.out.println("健康值增加50点");
	}
	/**
	 * 游泳方法   swimming()
	 */
	public void swimming() {
		System.out.println("游泳....");
		super.health -= 20;
		super.love += 10;
	}
}
