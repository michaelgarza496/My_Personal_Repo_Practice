package com.mikesimagination.characters;

import java.io.Serializable;

public class Hero implements Serializable{

	private static final long serialVersionUID = 5118126527300618258L;
	private String name;
	private int hitPoints;
	private int magicPoints;
	private int strength;
	private int intelligence;
	
	public Hero() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getMagicPoints() {
		return magicPoints;
	}

	public void setMagicPoints(int magicPoints) {
		this.magicPoints = magicPoints;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	@Override
	public String toString() {
		return "Hero [name=" + name + ", hitPoints=" + hitPoints + ", magicPoints=" + magicPoints + ", strength="
				+ strength + ", intelligence=" + intelligence + "]";
	}
	
	
}
