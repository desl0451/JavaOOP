package Chapter03.exercise02;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Master master = new Master("С��", 1000);
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭ�����������!");
		System.out.print("��ѡ��Ҫ�����ĳ�������:(1.����\t2.���):");
		int typeId = input.nextInt();
		Pet pet = master.getPet(typeId);
		if (pet != null) {
			System.out.println("�����ɹ�!");
			master.feed(pet);
			master.play(pet);
		} else {
			System.out.println("�Բ���,û�д����͵ĳ���,����ʧ��");
		}
	}
}
