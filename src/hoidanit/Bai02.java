package hoidanit;

import java.util.Scanner;

public class Bai02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("please input the length:");
		int length = sc.nextInt();

		System.out.println("please input width:");
		int width = sc.nextInt();

		System.out.println("chu vi hinh chữ nhật" + 2 * (length + width));
		System.out.println("dien tich " + (length * width));
		System.out.println("canh nho nhat  " + Math.min(length, width));

		sc.close();

	}

}
