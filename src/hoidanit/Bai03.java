package hoidanit;

import java.util.Scanner;

public class Bai03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hieu = 9;
		hieu += 30;

		System.out.println("vui long nhap canh :");
		int canh = sc.nextInt();

		System.out.println("the tich cua hinh lap phuong :" + Math.pow(canh, 3));
		sc.close();
	}
}
