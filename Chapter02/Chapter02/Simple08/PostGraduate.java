package Chapter02.Simple08;

public class PostGraduate extends Student {
	String guide;// ��ʦ

	public PostGraduate() {
		System.out.println("execute PostGraduate()");
	}

	public PostGraduate(String name, String school, String guide) {
		super(name, school);
		this.guide = guide;
		System.out.println("execute PostGraduate(name,school,guide)");
	}
}
