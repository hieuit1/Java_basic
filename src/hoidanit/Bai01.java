package hoidanit;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("please input the name :");
		String name = sc.nextLine();

		System.out.println("please input point :");
		int point = sc.nextInt();

		System.out.println("name :" + name + "\n" + "point :" + point);
	}
}
