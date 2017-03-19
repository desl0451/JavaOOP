package BBBB;

public final class Car extends MotoVehicle {

	private String type;// type类型

	@Override
	public int calRent(int days) {
		if (type.equals("1")) {// 宝马
			return 500 * days;
		} else if (type.equals("2")) {// GL8
			return 600 * days;
		} else { // 林荫大道
			return 300 * days;
		}
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Car(String no, String brand, String type) {
		super(no, brand);
		this.type = type;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String no, String brand) {
		super(no, brand);
		// TODO Auto-generated constructor stub
	}



}
