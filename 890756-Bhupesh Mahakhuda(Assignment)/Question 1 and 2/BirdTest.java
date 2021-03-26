package com.assignment;

public class BirdTest {

	private static Bird birdObj1 = new Bird();
	private static Bird birdObj2 = new Bird();

	public static void main(String[] args) {
		birdObj1 = new Bird(1, 250.34f, 355.45, true, "GREAT INDIAN BUSTARD");
		birdObj2 = new Bird(3, 350.34f, 1055.45, false, "Ruppell's Griffon Vulture");

		System.out.println("Bird-1" + birdObj1);
		birdObj1.fly();
		System.out.println("Bird-2" + birdObj2);
		birdObj2.fly();

	}

}
