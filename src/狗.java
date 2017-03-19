public class 狗 extends 宠物类 {
	private String 品种;

	@Override
	public void 吃东西() {
		// TODO Auto-generated method stub
		System.out.println("吃骨头....");
	}

	@Override
	public void 玩耍() {
		// TODO Auto-generated method stub
		System.out.println("转圆跑...");
		System.out.println("摇尾巴");
	}

	public 狗(String 名字, int 年龄, String 品种) {
		super(名字, 年龄);
		this.品种 = 品种;
	}

	public 狗(String 品种) {
		super();
		this.品种 = 品种;
	}

	public 狗() {
		super();
		// TODO Auto-generated constructor stub
	}

	public 狗(String 名字, int 年龄) {
		super(名字, 年龄);
		// TODO Auto-generated constructor stub
	}

	public String get品种() {
		return 品种;
	}

	public void set品种(String 品种) {
		this.品种 = 品种;
	}

}
