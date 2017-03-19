package BBBB;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String brand = "";
		String no = "";// 车牌号
		int rent = 0;// 租金
		System.out.println("欢迎来到汽车租赁公司!");
		System.out.print("请输入要租赁的天数:");
		int days = input.nextInt();
		System.out.print("请输入要租凭的汽车类型(1.轿车\t2.客车):");
		String type = input.next();
		if (type.equals("1")) {
			System.out.print("请输入要租赁的汽车品牌(1.宝马\t2.别克):");
			type = input.next();
			if (type.equals("2")) {
				System.out.print("请输入轿车的型号2.商务舱GL8\t3.林荫大道:");
				type = input.next();
			}
			no = "黑A00001";
			System.out.println("分配给您的汽车牌号是:" + no);

			Car car = new Car(no, brand, type);
			rent = car.calRent(days);
			System.out.println("\n顾客您好!您需要支付的租赁费用是" + rent);
		} else {
			System.out.print("请输入要租赁的客车品牌(1.金杯\t2.金龙):");
			type = input.next();
			no = "黑A00002";
			System.out.print("请输入客车的座位数:");
			int seatCount = input.nextInt();
			System.out.println("分配给您的汽车牌号是:" + no);
			Bus bus = new Bus(no, brand, seatCount);
			rent = bus.calRent(days);
			System.out.println("\n顾客您好!您需要支付的租赁费用是" + rent);
		}
	}

}
