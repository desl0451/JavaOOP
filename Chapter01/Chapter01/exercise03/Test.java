package Chapter01.exercise03;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭ�����������!");
		// 1.�����������
		System.out.print("������Ҫ�������������:");
		String name = input.next();
		// 2.ѡ���������
		System.out.print("��ѡ��Ҫ�����ĳ�������:(1������ 2�����)");
		switch (input.nextInt()) {
		case 1:
			// 2.1�������,ѡ�񹷹�Ʒ��
			System.out.println("��ѡ�񹷹���Ʒ��:(1����������������Ȯ 2������ѩ����Ȯ)");
			String strain = null;
			if (input.nextInt() == 1) {
				strain = "��������������Ȯ";
			} else {
				strain = "����ѩ����Ȯ";
			}
			// �����������󲢸�ֵ
			Dog dog = new Dog(name, strain);
			dog.print();
			break;
		case 2:
			// 2.2��������,ѡ������Ա�
			System.out.print("��ѡ�������Ա�:(1���� 2����)");
			String sex = null;
			if (input.nextInt() == 1) {
				sex = Penguin.SEX_MALE;
			} else {
				sex = Penguin.SEX_FEMALE;
			}
			//���������󲢸�ֵ
			//�Զ���һ���в������죬ϵͳ�Ͳ���Ĭ�Ϸ����޲������죬ʹ���޲�������ʱ�������ֶ�����޲�������Ķ���
			Penguin pgn = new Penguin(name, sex);
			pgn.print();
			break;
		default:
			break;
		}
	}
}
