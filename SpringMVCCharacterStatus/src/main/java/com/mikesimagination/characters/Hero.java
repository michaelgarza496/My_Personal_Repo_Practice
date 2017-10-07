package com.mikesimagination.characters;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="CHARACTERS")
public class Hero implements Serializable{

	private static final long serialVersionUID = 5118126527300618258L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CH_ID")
	private int id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="HITPOINTS")
	private int hitPoints;
	
	@Column(name="MAGICPOINTS")
	private int magicPoints;
	
	@Column(name="STRENGTH")
	private int strength;
	
	@Column(name="INTELLIGENCE")
	private int intelligence;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
		return "Hero [id=" + id + ", name=" + name + ", hitPoints=" + hitPoints + ", magicPoints=" + magicPoints
				+ ", strength=" + strength + ", intelligence=" + intelligence + "]";
	}
	
	
}
