package hoidanit;

import java.util.Scanner;

public final class HelloWorld {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int a = 2;
//		int b = 6;
//		int c = Math.max(a, b);
//		System.out.println("Max =" + c);

		System.out.println("nhập số a =");
		int a = sc.nextInt();
		System.out.println("nhập số b =");
		int b = sc.nextInt();

		int c = Math.max(a, b);
		System.out.println("number max :" + c);
		System.out.println("min :" + Math.min(a, b));

//		System.out.println("Sign up");
//
//		System.out.println("name :");
//		String name = sc.nextLine();
//
//		System.out.println("email :");
//		String email = sc.nextLine();
//
//		System.out.println("phone :");
//		int phone = sc.nextInt();
//
////		System.out.println("password :");
////		String passWord = sc.nextLine();
//
//		System.out.println(" name :" + name + " email :" + email + " phone :" + phone);

		sc.close();
	}
}
