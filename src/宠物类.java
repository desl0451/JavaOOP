public abstract class 宠物类 {
	String 名字;
	int 年龄;

	public abstract void 吃东西();

	public abstract void 玩耍();

	public 宠物类() {
		super();
		// TODO Auto-generated constructor stub
	}

	public 宠物类(String 名字, int 年龄) {
		super();
		this.名字 = 名字;
		this.年龄 = 年龄;
	}

	public String get名字() {
		return 名字;
	}

	public void set名字(String 名字) {
		this.名字 = 名字;
	}

	public int get年龄() {
		return 年龄;
	}

	public void set年龄(int 年龄) {
		this.年龄 = 年龄;
	}

}
