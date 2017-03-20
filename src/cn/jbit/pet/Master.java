package cn.jbit.pet;

/**
 * 主人类
 */
public class Master {
	private String name = "";// 名字
	private int money = 0;// 元宝数

	// alt+shift+s+o
	/**
	 * 构造函数
	 * 
	 * @param name
	 *            　名字
	 * @param money
	 *            元宝数
	 */
	public Master(String name, int money) {
		this.name = name;
		this.money = money;
	}

	/**
	 * 喂食方法->狗
	 */
	// public void feed(Dog dog) {
	// dog.eat();
	// }

	/**
	 * 喂食方法->企鹅
	 */
	// public void feed(Penguin pgn) {
	// pgn.eat();
	// }

	/**
	 * 喂食方法->猫
	 */
	// public void feed(Cat cat) {
	// cat.eat();
	// }

	// 实现多态第一种方法:方法参数设置父类
	/**
	 * 喂食方法
	 * 
	 * @param pet
	 */
	public void feed(Pet pet) {
		pet.eat();
	}

	// 父类　对象=new 子类();//
	/**
	 * 治疗方法
	 * 
	 * @param pet
	 */
	public void 治疗(Pet pet) {
		pet.zhiliao();
	}

	/**
	 * 领养宠物方法
	 */
	// public 返回值写父类 方法名(参数){
	// 　
	// }
	public Pet getPet(String typeId) {
		// 创建一个宠物???
		Pet pet = null;
		if (typeId.equals("1")) {
			pet = new Dog("欧欧", "拉布拉多犬");
		} else if (typeId.equals("2")) {
			pet = new Penguin("仔仔", "雄");
		} else {
			pet = new Cat("小花", "白色");
		}

		return pet;
	}

	public void play(Pet pet) {
		if (pet instanceof Dog) {
			Dog dog = (Dog) pet;
			dog.catchingFlyDisc();
		} else if (pet instanceof Penguin) {
			Penguin pgn = (Penguin) pet;
			pgn.swimming();
		} else if (pet instanceof Cat) {
			Cat cat = (Cat) pet;
			cat.shangshu();
		}
	}

}
