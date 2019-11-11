package com.skilldistillery.jurassicpark.data;

import java.util.List;

import com.skilldistillery.jurassicpark.entities.Dinosaur;

public interface DinoDao {

	Dinosaur findById(int id);
	List<Dinosaur> findAll();
	Dinosaur addNewDino(Dinosaur dino);
	String removeDino(int dinoId);
	Dinosaur updateDino(int dinoId, String newName, int newHeight, int newWeight, boolean newFlying, String newDiet,
			String newSpecialChars, String newSpecies);
	List<Dinosaur> findAllDinos();

}
