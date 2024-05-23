package Lap02If_Switch;

import java.util.Scanner;

public class bai01 {

	public static void main(String[] args) {
//		Bài 1: Cho phương trình ax + b = 0
//				Viết chương trình nhập vào 2 số nguyên a và b. Tính toán nghiệm của phương trình
//				trên

		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so a :");
		int a = sc.nextInt();
		System.out.println("nhap so b :");
		int b = sc.nextInt();

		System.out.printf("giải phương trình bật nhất %dx + %d = 0 \n", a, b);

		if (a == 0 && b == 0) {
			System.out.println("phuong trinh co vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("phuong trinh vo nghiem");
		} else {
			float x = (float) -b / a;
			System.out.println("x co nghiem bang :" + x);
		}

		sc.close();

	}

}
