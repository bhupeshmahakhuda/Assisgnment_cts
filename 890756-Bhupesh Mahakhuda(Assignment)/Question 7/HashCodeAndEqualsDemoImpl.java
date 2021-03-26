package com.assignment;

public class HashCodeAndEqualsDemoImpl {
	public static void main(String[] args) {
		HashCodeAndEqualsDemo obj1 = new HashCodeAndEqualsDemo();
		HashCodeAndEqualsDemo obj2 = new HashCodeAndEqualsDemo();

		System.out.println("Obj1 = " + obj1.hashCode() + "\nObj2 = " + obj2.hashCode());
		System.out.println(obj1.equals(obj2));
	}
}
