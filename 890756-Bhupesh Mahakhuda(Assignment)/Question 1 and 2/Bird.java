package com.assignment;

public class Bird {
	private int id;
	private float weight;
	private double flyingHeight;
	private boolean isRare;
	private String speciesName;

	public Bird() {
	}

	public Bird(int id, float d, double flyingHeight, boolean isRare, String speciesName) {
		super();
		this.id = id;
		this.weight = d;
		this.flyingHeight = flyingHeight;
		this.isRare = isRare;
		this.speciesName = speciesName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public double getFlyingHeight() {
		return flyingHeight;
	}

	public void setFlyingHeight(double flyingHeight) {
		this.flyingHeight = flyingHeight;
	}

	public boolean isRare() {
		return isRare;
	}

	public void setRare(boolean isRare) {
		this.isRare = isRare;
	}

	public String getSpeciesName() {
		return speciesName;
	}

	public void setSpeciesName(String speciesName) {
		this.speciesName = speciesName;
	}

	@Override
	public String toString() {
		return "Bird [weight=" + weight + ", flyingHeight=" + flyingHeight + ", isRare=" + isRare + ", speciesName="
				+ speciesName + "]";
	}

	public void fly() {
		System.out.println("The Bird " + this.speciesName + " is flying high!!");
	}

}
