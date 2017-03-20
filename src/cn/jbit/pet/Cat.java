package cn.jbit.pet;

public class Cat extends Pet {
	private String color;

	public Cat(String name, String color) {
		super(name);
		this.color = color;
	}

	@Override
	public void eat() {
		super.health = super.health + 4;
		System.out.println("猫猫" + this.name + "吃饱了.!健康值增加4");
	}

	@Override
	public void print() {
		super.print();
		System.out.println("颜色" + this.color);
	}

	// 1.快捷键alt+shift+s+v

	@Override
	public void zhiliao() {
		super.health = super.health + 30;
		if (super.health > 100) {
			super.health = 100;
		}
		System.out.println("健康值增加30点");
	}

	/**
	 * 上树方法
	 */
	public void shangshu() {
		System.out.println(" 上树....");
		super.health -= 4;
		super.love += 5;
	}
}
