package Chapter03.Question06;

public class Friend {
	private String nationality; // ����
	private String name; // ����

	public Friend(String nationality, String name) {
		super();
		this.nationality = nationality;
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void eat(String food) {
		System.out.println("��" + food + "��");
	}
}
