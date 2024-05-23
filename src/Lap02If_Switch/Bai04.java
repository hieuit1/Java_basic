package Lap02If_Switch;

import java.util.Scanner;

public class Bai04 {

	public static void giaiPhuongTrinhBacNhat(int a, int b) {
		System.out.printf("giải phương trình bật nhất %dx + %d = 0 \n", a, b);

		if (a == 0 && b == 0) {
			System.out.println("phuong trinh co vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("phuong trinh vo nghiem");
		} else {
			float x = (float) -b / a;
			System.out.printf(" co nghiem bang x%.6f:", x);
		}
	}

	public static void giaiPhuongTrinhBacHai(int a, int b, int c) {
		System.out.printf("giải phương trình bật hai %dx^2 + %dx + %d = 0 \n", a, b, c);

		if (a == 0) {
			giaiPhuongTrinhBacNhat(a, b);
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
	}

	public static void tinhTienDien(int electricLetters) {
		if (electricLetters <= 100) {
			int x = electricLetters * 1000;
			System.out.println("so tien dien la" + x);
		} else {
			int x = 100 * 1000 + (electricLetters - 100) * 1500;
			System.out.println("so tien dien la" + x);
		}
	}

	public static void main(String[] age) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");

		Scanner sc = new Scanner(System.in);
		System.out.println("please chosen number :");
		int choose = sc.nextInt();

		switch (choose) {
		case 1:
			System.out.println("| 1. Giải phương trình bậc nhất |");
			System.out.println("nhan a");
			int b = sc.nextInt();
			System.out.println("nhan b");
			int c = sc.nextInt();
			giaiPhuongTrinhBacNhat(b, c);
			break;
		case 2:
			System.out.println("| 2. Giải phương trình bậc hai |");
			System.out.println("nhan b");
			int a = sc.nextInt();
			System.out.println("nhan b");
			int x = sc.nextInt();
			System.out.println("nhan c");
			int z = sc.nextInt();
			giaiPhuongTrinhBacHai(a, x, z);
			break;
		case 3:
			System.out.println("| 3. Tính số tiền điện |");
			System.out.println("nhap so chu dien");
			int electricLetters = sc.nextInt();
			tinhTienDien(electricLetters);
			break;
		default:
			System.out.println("ban da thoat chuong trinh");
			System.exit(0);
		}
		sc.close();
	}

}