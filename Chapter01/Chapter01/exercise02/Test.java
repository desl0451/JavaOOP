package Chapter01.exercise02;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭ����������꣡");
		// 1�� �����������
		System.out.print("������Ҫ������������֣�");
		String name = input.next();
		// 2�� ѡ���������
		System.out.print("��ѡ��Ҫ�����ĳ������ͣ���1������ 2����죩");
		switch (input.nextInt()) {
		case 1:
			// ����ǹ���,ѡ�񹷹�Ʒ��
			System.out.print("��ѡ�񹷹���Ʒ��:(1����������������Ȯ" + " 2������ѩ����)");
			String strain = null;
			if (input.nextInt() == 1) {
				strain = "��������������Ȯ";
			} else {
				strain = "����ѩ����";
			}
			System.out.print("�����빷���Ľ���ֵ��1~100֮�䣩��");
			int health = input.nextInt();
			// �����������󲢸�ֵ
			Dog dog = new Dog();
			dog.setName(name);
			dog.setStrain(strain);
			dog.setHealth(health);
			// ���������Ϣ
			dog.print();
			break;
		}
	}
}
