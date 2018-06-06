package com.zoo;

public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("Throwing Something");
		this.energyLevel -= 5;
	}
	public void eatBananas() {
		System.out.println("Eating Bananas");
		this.energyLevel += 10;
	}
	public void climb() {
		System.out.println("Climbing Tree");
		this.energyLevel -= 10;
	}
	
}
