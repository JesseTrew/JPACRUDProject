package com.skilldistillery.jurassicpark.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dinosaur {

	// F i e l d s

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int height;
	private int weight;
	private boolean flying;
	private String diet;
	@Column(name = "special_characteristics")
	private String specialChars;

	// C o n s t r u c t o r s

	public Dinosaur() {
		super();
	}

	public Dinosaur(String name, int height, int weight, boolean flying, String diet, String specialChars) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.flying = flying;
		this.diet = diet;
		this.specialChars = specialChars;
	}

	// M e t h o d s

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isFlying() {
		return flying;
	}

	public void setFlying(boolean flying) {
		this.flying = flying;
	}

	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	public String getSpecialChars() {
		return specialChars;
	}

	public void setSpecialChars(String specialChars) {
		this.specialChars = specialChars;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diet == null) ? 0 : diet.hashCode());
		result = prime * result + (flying ? 1231 : 1237);
		result = prime * result + height;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((specialChars == null) ? 0 : specialChars.hashCode());
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dinosaur other = (Dinosaur) obj;
		if (diet == null) {
			if (other.diet != null)
				return false;
		} else if (!diet.equals(other.diet))
			return false;
		if (flying != other.flying)
			return false;
		if (height != other.height)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (specialChars == null) {
			if (other.specialChars != null)
				return false;
		} else if (!specialChars.equals(other.specialChars))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dino ID: " + id + " -- Name: " + name + " -- Height: " + height + " -- Weight: " + weight + " -- Flying: "
				+ flying + " -- Diet: " + diet + " -- Special Characteristics: " + specialChars;
	}
}
