package cn.jbit.pet;

public class Dog extends Pet {
	/**
	 * 品种
	 */
	private String strain;

	/**
	 * 构造函数
	 * 
	 * @param name
	 *            宠物名字
	 * @param strain
	 *            品种 1.调用构造函数 super(XXX) 2.调用父类的属性 super.health 3.调用父类的方法
	 *            super.print();
	 */
	public Dog(String name, String strain) {
		super(name);
		this.strain = strain;
	}

	/**
	 * 重写父类方法 1.快捷键 alt+shift+s+v 2.手写
	 */
	@Override
	public void print() {
		super.print();// 3.调用父类的方法
		System.out.println("宠物的品种：" + this.strain);
	}

	/**
	 * 吃方法 重写 1.方法名相同 2.参数列表相同 3.返回值类型相同或是其子类 4.重写方法不能缩小被重写方法的访问权限
	 */
	@Override
	public void eat() {
		super.health = super.health + 3;
		System.out.println("狗狗" + super.name + "吃饱了!健康值增加3");
	}

	/**
	 * 治疗方法
	 */
	@Override
	public void zhiliao() {
		super.health = super.health + 40;
		if (super.health > 100) {
			super.health = 100;
		}
		System.out.println("健康值增加40点");
	}
	/**
	 * 接飞盘方法   
	 */
	public void catchingFlyDisc() {
		System.out.println("接飞盘....");
		super.health -= 10;
		super.love += 5;
	}
}
