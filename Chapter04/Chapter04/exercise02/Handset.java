package Chapter04.exercise02;

public abstract class Handset {
	private String brand; // Ʒ��
	private String type; // �ͺ�

	public abstract void call();

	public abstract void sendInfo();

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void ShowInfo() {
		System.out.println("����һ���ͺ�Ϊ" + type + "��" + brand + "�ֻ�:");
	}
}
