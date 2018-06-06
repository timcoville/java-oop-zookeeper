package com.zoo;

public class Bat extends Mammal{
	public Bat() {
		this.energyLevel = 300;
	}
	public void Fly() {
		System.out.println("Giant Bat is Flying");
		this.energyLevel -= 50;
	}
	public void eatHumans() {
		System.out.println("The Bat grabs another human from the crowd!");
		this.energyLevel += 25;
	}
	public void attackTown() {
		System.out.println("Ahhh a fire... oihu23h2g2h02!");
		this.energyLevel -= 100;
	}
	
}
