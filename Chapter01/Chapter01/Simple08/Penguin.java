package Chapter01.Simple08;

public class Penguin {
	String name = "无名氏";
	int health = 100;
	int love = 0;
	String sex = "Q仔";// 性别

	public Penguin() {
		name = "楠楠";
		love = 20;
		sex = "Q妹";
		System.out.println("执行构造方法");
	}

	public Penguin(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}

	public Penguin(String name, int health, int love, String sex) {
		this.name = name;
		this.health = health;
		this.love = love;
		this.sex = sex;
	}

	public void print() {
		System.out.println("宠物的自白:\n我的名字叫" + this.name + ",健康值是" + this.health
				+ ",和主人的亲密度是" + this.love + ",性别是" + this.sex + "。");
	}

	public static void main(String[] args) {
		Penguin pgn = null;
		pgn = new Penguin();
		pgn.print();
		pgn = new Penguin("亚亚", "企鹅");
		pgn.print();
		pgn = new Penguin("美美", 80, 20, "Q仔");
		pgn.print();
	}
}
