package Chapter01.Simple03;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 1.�����������
		System.out.println("������Ҫ�������������:");
		String name = input.next();
		// 2.ѡ����������
		System.out.println("��ѡ��Ҫ�����ĳ�������:(1.���� 2.��죩");
		switch (input.nextInt()) {
		case 1:
			// 2.1����ǹ���,ѡ�񹷹�Ʒ��
			System.out.println("��ѡ�񹷹���Ʒ��:(1����������������Ȯ 2������ѩ����Ȯ)");
			String strain = null;
			if (input.nextInt() == 1) {
				strain = "��������������Ȯ";
			} else {
				strain = "����ѩ����Ȯ";
			}
			// �����������󲢸�ֵ
			Dog dog = new Dog();
			dog.name = name;
			dog.strain = strain;
			// ����������Ϣ
			dog.print();
			break;
		case 2:
			// 2.2�������죬ѡ������Ա�
			System.out.println("��ѡ�������Ա�:(1��Q�� 2��Q�ã�");
			String sex = null;
			if (input.nextInt() == 1) {
				sex = "Q��";
			} else {
				sex = "Q��";
			}
			// ���������󲢸�ֵ
			Penguin pgn = new Penguin();
			pgn.name = name;
			pgn.sex = sex;
			// ��������Ϣ
			pgn.print();
			break;
		default:
			break;
		}
	}

}
