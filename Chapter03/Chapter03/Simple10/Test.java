package Chapter03.Simple10;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Master master = new Master("������", 100);
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭ����Ϊ�������!");
		System.out.print("��ѡ��Ҫ�����ĳ�������:(1������ 2�����):");
		int typeId = input.nextInt();
		Pet pet = master.getpet(typeId);
		if (pet != null) {
			System.out.println("�����ɹ�!");
			master.feed(pet);
		} else {
			System.out.println("�Բ���û�д����͵ĳ������ʧ��!");
		}
	}
}
