package Chapter03.exercise03;

import java.util.Scanner;

public class TestRent {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int days;// ��������
		int totalRent;// �����޼�
		int money = 0;
		// �ͻ����޵Ķ���������Ϣ����������
		MotoVehicle motos[] = new MotoVehicle[4];
		motos[0] = new Car("��NY28588", "����", "550i");
		motos[1] = new Car("��NNN3284", "����", "550i");
		motos[2] = new Car("��NT43765", "���", "������");
		motos[3] = new Bus("��5643765", "����", 34);
		days = 5;
		System.out.println("�����ƺ�\t\t����Ʒ��");
		for (int i = 0; i < motos.length; i++) {
			System.out.println(motos[i].getNo() + "\t" + motos[i].getBrand());
			money += motos[i].calRent(days);
		}
		String name = "��ΰ";
		System.out.println("\n�ͻ���:" + name + ",��������:" + days + ",��ƾ�ܷ���:"
				+ money);
	}
}
