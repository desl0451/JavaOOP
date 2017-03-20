package cn.jbit.pet;

/*
 * 宠物类
 */
public abstract class Pet {
	// 属性
	protected String name = "无名氏";// 昵称
	protected int health = 0; // 健康值
	protected int love = 0;// 亲密度

	/**
	 * 1.方法名与类名相同 2.无返回值 3.可以重载 4.初始化数据
	 */
	// alt+shift+s+c 无参
	public Pet() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}

	// alt+shift+s+o 有参构造函数
	public Pet(String name) {
		this.name = name;
	}

	/**
	 * 输出宠物的信息 方法
	 */
	public void print() {
		System.out.println("宠物的自白:\n我的名字叫" + this.name + ",健康值是" + this.health
				+ ",和认一的亲密度是" + this.love + "。");
	}

	/**
	 * 抽象方法eat(),负责宠物吃饭功能
	 */
	public abstract void eat();// 有抽象方法的类一定是抽象类
	
	/**
	 * 抽象方法zhiliao(),负责宠物治疗方法
	 */
	public abstract void zhiliao();//治疗方法
	
	
	
} // Dog Penguin strain sex
