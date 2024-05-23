package hoidanit;

import java.util.Scanner;

public class Bai04IfElse {
	public static void main(String[] age) {
//		làm bài tập tính thuế tax (thue)
		Scanner sc = new Scanner(System.in);

		System.out.println("vui long nhap tien thue");
		float money = sc.nextFloat();

		if (money < 10) {
			System.out.println("khong dong thue");
		} else if (10 <= money && money <= 15) {
			System.out.println("dong thue 10% ");
		} else if (15 <= money && money <= 30) {
			System.out.println("dong thue 20% ");
		} else {
			System.out.println("dong thue 50% ");
		}

		sc.close();
	}
}
