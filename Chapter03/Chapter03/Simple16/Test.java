package Chapter03.Simple16;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Master master = new Master("王先生", 100);
		System.out.println("欢迎无情为到宠物店!");
		System.out.print("请选择要领养的宠物类型:(1.狗狗\t2.企鹅):");
		int typeId = input.nextInt();
		Pet pet = master.getpet(typeId);
		if (pet != null) {
			System.out.println("领养成功!");
			master.feed(pet);
			master.play(pet);
		} else {
			System.out.println("对不起，没有此类型的宠物，领养失败!");
		}
	}
}
