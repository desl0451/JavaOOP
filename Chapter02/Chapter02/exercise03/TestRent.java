package Chapter02.exercise03;

import java.util.Scanner;

public class TestRent {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String No = "";// ����
		int rent = 0;// ���
		System.out.println("��ӭ����Ϊ���������޹�˾!");
		System.out.print("������Ҫ���޵�����:");
		int days = input.nextInt();
		System.out.print("������Ҫ���޵���������(1.�γ�  2.�ͳ�):");
		String type = input.next();
		if (type.equals("1")) {
			System.out.print("������Ҫ���޵�����Ʒ��(1.����  2.���):");
			String carBrand = input.next();
			No = "��BK5543";
			if (carBrand.equals("1")) {
				System.out.println("��ѡ��ĳ�����:����550i");
			} else {
				System.out.print("������γ����ͺ�  2.�����GL8  3.������:");
				carBrand = input.next();
				if (carBrand.equals("2")) {
					System.out.println("��ѡ��ĳ�����:�����GL8");
				} else {
					System.out.println("��ѡ��ĳ�����:������");
				}
			}
			System.out.println("��������������ƺ���:" + No);
			Car car = new Car(No, type, carBrand);
			rent = car.calRent(days);

		} else {
			System.out.print("��������Ҫ���޵�Ʒ��(1.��   2.����):");
			String busBrand = input.next();
			System.out.print("������ͳ�����λ��:");
			int seatCount = input.nextInt();
			if (busBrand.equals("1")) {
				System.out.println("��ѡ��ĳ�����:��");
			} else {
				System.out.println("��ѡ��ĳ�����:����");
			}
			No = "��AU8769";
			System.out.println("��������������ƺ���:" + No);
			Bus bus = new Bus(No, busBrand, seatCount);
			rent = bus.calRent(days);
		}
		System.out.println("\n�˿�����!����Ҫ֧�������޷�����" + rent + ".");
	}
}
