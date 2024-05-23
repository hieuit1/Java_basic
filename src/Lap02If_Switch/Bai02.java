package Lap02If_Switch;

import java.util.Scanner;

public class Bai02 {

	public static void giaiPhuongTrinhBatNhat(int b, int c) {
		System.out.printf("giải phương trình bật nhất %dx + %d = 0 \n", b, c);

		if (b == 0 && c == 0) {
			System.out.println("phuong trinh co vo so nghiem");
		} else if (b == 0 && c != 0) {
			System.out.println("phuong trinh vo nghiem");
		} else {
			float x = (float) -b / c;
			System.out.println("x co nghiem bang :" + x);
		}
	}

	public static void main(String[] args) {
//		
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so a :");
		int a = sc.nextInt();
		System.out.println("nhap so b :");
		int b = sc.nextInt();
		System.out.println("nhap so c :");
		int c = sc.nextInt();

		System.out.printf("giải phương trình bật hai %dx^2 + %dx + %d = 0 \n", a, b, c);
//		Bài 2: Cho phương trình: ax^2 + bx + c = 0
//		Viết chương trình nhập vào 3 số nguyên a, b, c. Tính toán nghiệm của phương trình
//		trên
//		Gợi ý:
//		- Nếu a = 0 => làm tương tự ví dụ bài 1
//		- Nếu a # 0:
//				- Tính delta = b^2 - 4ac.
//				- Nếu delta < 0 => thông báo "phương trình vô nghiệm"
//				- Nếu delta = 0 => thông báo "nghiệm kép x = -b/(2*a)
//				- Nếu delta > 0 => thông báo có 2 nghiệm riêng biệt
//				x1 = (-b + căn(delta))/(2*a)
//				x2 = (-b - căn(delta))/(2*a)

		if (a == 0) {
			giaiPhuongTrinhBatNhat(b, c);
		} else {
			int delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("phuong trinh vo nghiem");
			} else if (delta == 0) {
				float x = (float) -b / (2 * a);
				System.out.printf("Nghiem kep x = %.3f", x);
			} else {
				double x1 = -b + Math.sqrt(delta) / (2 * a);
				double x2 = -b - Math.sqrt(delta) / (2 * a);
				System.out.printf("co 2 nghiem rieng biet x1 = %.6f, x2 = %.6f", x1, x2);
			}
		}
		sc.close();
	}

}
