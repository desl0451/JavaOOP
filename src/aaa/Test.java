package aaa;

/**
 * 测试类，测试继承条件下的构造方法。
 */
public class Test {
	public static void main(String[] args) {
		// 1、创建狗狗对象dog并输出信息
		Dog dog = new Dog("欧欧", "雪娜瑞");
		dog.print();
		// 2、创建企鹅对象pgn并输出信息
		Penguin pgn = new Penguin("楠楠", "Q妹");
		pgn.print();
	}
}
