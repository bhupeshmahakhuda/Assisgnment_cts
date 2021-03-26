package com.assignment;

import java.util.Scanner;

public class AddAnyValue {

	private static Scanner sc = new Scanner(System.in);

	public static int add(int num) {
		int total = 0;
		while (num != 0) {
			int val = sc.nextInt();
			total += val;
			num--;
		}
		return total;
	}

	public static String add(String count) {
		int num = Integer.parseInt(count);
		String total = "";
		while (num != 0) {
			String val = sc.next();
			total += val;
			num--;
		}

		return total;
	}

	public static void main(String[] args) {
		System.out.println("How many Integer inputs you want to give");
		int num = sc.nextInt();
		System.out.println("Enter " + num + " inputs!!");

		int intSum = add(num);

		System.out.println("How many String inputs you want to give");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " inputs!!");

		String count = Integer.toString(n);

		String strSum = add(count);

		System.out.println("Addition of int values=" + intSum + "\nAddition of string values" + strSum);

	}
}
