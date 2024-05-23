package hoidanit;

import java.util.Scanner;

public class Bai05Switch {

	public static void main(String[] args) {
//		Yêu cầu:
//			Nếu nhập vào 1 => in ra "Bạn đã lựa chọn phép cộng"
//			Nếu nhập vào 2 => in ra "Bạn đã lựa chọn phép trừ"
//			Nếu nhập vào 3 => in ra "Bạn đã lựa chọn thoát chương trình" => System.exit(0);

		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ------------------ ++");
		System.out.println("| 1. Cộng |");
		System.out.println("| 2. Trừ |");
		System.out.println("| 3. Kết thúc |");
		System.out.println("++ ------------------ ++");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lựa chọn của bạn là : ");
		int chosen = scanner.nextInt();

		switch (chosen) {
		case 1:
			System.out.println("Bạn đã lựa chọn phép cộng");
			break;
		case 2:
			System.out.println("Bạn đã lựa chọn phép trừ");
			break;
		case 3:
			System.out.println("Bạn đã lựa chọn thoát chương trình");
			break;

		default:
			System.out.println("ban chon sai vui long chon cai khac");
			System.exit(0);// lựa chọn thoát chương trình
			break;
		}

		scanner.close();
	}

}
