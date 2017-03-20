package cn.jbit.pet;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//		Master master = new Master("小宝", 1000);// 主人对象
//
//		Scanner input = new Scanner(System.in);
//		System.out.println("请输入你领养的宠物(1.狗狗\t2.企鹅\t3.猫猫):");
//		String typeId = input.next(); // 输入你要领养的宠物
//		Pet pet = master.getPet(typeId);// 领养?
//		master.feed(pet);// 喂食　
//		master.play(pet);
//		master.治疗(pet);
		
		
		
		Pet pet=new Dog("","");//1.向上转型,自动进行类型转换
		
		Dog dog=(Dog)pet;      //2.向下转型,父类到子类的转换
	}
}
