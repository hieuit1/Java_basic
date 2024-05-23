package Lap02If_Switch;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] age) {
//		Bài 3: Viết chương trình tính số tiền điện (in kết quả ra console)
//		Yêu cầu: nhập vào số điện, sau đấy tính số tiền dựa vào quy luật sau:
//		- Nếu số điện sử dụng từ 0 tới 100, giá mỗi số điện là 1000
//		- Từ số điện 101 (tức là > 100), giá mỗi số điện là 1500

//		Gợi ý:
//		- Nếu số điện <= 100 => số tiền = số điện x 1000
//		- Nếu số điện > 100
//		=> số tiền = 100 * 1000 + (số điện - 100) * 1500

		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so chu dien :");
		int electricLetters = sc.nextInt();

		if (electricLetters <= 100) {
			int x = electricLetters * 1000;
			System.out.println("so tien dien la" + x);
		} else {
			int x2 = 100 * 1000 + (electricLetters - 100) * 1500;
			System.out.println("so tien dien la" + x2);
		}

		sc.close();
	}
}
