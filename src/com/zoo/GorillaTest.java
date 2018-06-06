package com.zoo;

public class GorillaTest {
	public static void main(String[] Args) {
		Gorilla g = new Gorilla();
		System.out.println(g.displayEnergy());
		g.throwSomething();
		g.throwSomething();
		g.throwSomething();
		System.out.println(g.displayEnergy());
		g.eatBananas();
		g.eatBananas();
		System.out.println(g.displayEnergy());
		g.climb();
		System.out.println(g.displayEnergy());
	}
}
