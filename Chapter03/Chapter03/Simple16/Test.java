package Chapter03.Simple16;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Master master = new Master("������", 100);
		System.out.println("��ӭ����Ϊ�������!");
		System.out.print("��ѡ��Ҫ�����ĳ�������:(1.����\t2.���):");
		int typeId = input.nextInt();
		Pet pet = master.getpet(typeId);
		if (pet != null) {
			System.out.println("�����ɹ�!");
			master.feed(pet);
			master.play(pet);
		} else {
			System.out.println("�Բ���û�д����͵ĳ������ʧ��!");
		}
	}
}
