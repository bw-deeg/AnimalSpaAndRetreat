package com.skilldistillery.spa.entities;

public class Xenomorph extends Animal{
	private String noise = "Sizzzzzzzzzle";
	
	// methods
	public Xenomorph() {
		super();
	}
	
	public Xenomorph(String name) {
		super( name );
	}
	
	public Xenomorph(String name, String noise) {
		super( name );
		this.noise = this.noise + " " + noise;
	}
	
	@Override
	public void makeNoise() {
		super.makeNoise();
		System.out.println("noisy I be " + noise);
	}
}
