package BBBB;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String brand = "";
		String no = "";// ���ƺ�
		int rent = 0;// ���
		System.out.println("��ӭ�����������޹�˾!");
		System.out.print("������Ҫ���޵�����:");
		int days = input.nextInt();
		System.out.print("������Ҫ��ƾ����������(1.�γ�\t2.�ͳ�):");
		String type = input.next();
		if (type.equals("1")) {
			System.out.print("������Ҫ���޵�����Ʒ��(1.����\t2.���):");
			type = input.next();
			if (type.equals("2")) {
				System.out.print("������γ����ͺ�2.�����GL8\t3.������:");
				type = input.next();
			}
			no = "��A00001";
			System.out.println("��������������ƺ���:" + no);

			Car car = new Car(no, brand, type);
			rent = car.calRent(days);
			System.out.println("\n�˿�����!����Ҫ֧�������޷�����" + rent);
		} else {
			System.out.print("������Ҫ���޵Ŀͳ�Ʒ��(1.��\t2.����):");
			type = input.next();
			no = "��A00002";
			System.out.print("������ͳ�����λ��:");
			int seatCount = input.nextInt();
			System.out.println("��������������ƺ���:" + no);
			Bus bus = new Bus(no, brand, seatCount);
			rent = bus.calRent(days);
			System.out.println("\n�˿�����!����Ҫ֧�������޷�����" + rent);
		}
	}

}
