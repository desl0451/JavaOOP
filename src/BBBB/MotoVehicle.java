package BBBB;

public abstract class MotoVehicle {
	private String no;
	private String brand;
	public MotoVehicle(String no, String brand) {
		super();
		this.no = no;
		this.brand = brand;
	}

	public MotoVehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public abstract int calRent(int days);


}
