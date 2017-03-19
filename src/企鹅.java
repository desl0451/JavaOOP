
public class 企鹅 extends 宠物类 {
	private String 性别;
	public 企鹅(String 名字, int 年龄, String 性别) {
		super(名字, 年龄);
		this.性别 = 性别;
	}

	public String get性别() {
		return 性别;
	}

	public void set性别(String 性别) {
		this.性别 = 性别;
	}

	@Override
	public void 吃东西() {
		// TODO Auto-generated method stub
		System.out.println("吃鱼");
	}

	@Override
	public void 玩耍() {
		// TODO Auto-generated method stub
		System.out.println("打豆豆");
	}

}
