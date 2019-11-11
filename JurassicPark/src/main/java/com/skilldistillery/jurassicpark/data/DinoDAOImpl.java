package com.skilldistillery.jurassicpark.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.jurassicpark.entities.Dinosaur;

@Transactional
@Service
public class DinoDAOImpl implements DinoDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Dinosaur findById(int id) {
		return em.find(Dinosaur.class, id);
	}

	@Override
	public List<Dinosaur> findAll() {
		String query = "SELECT dino FROM Dinosaur dino";
		List<Dinosaur> dinos = em.createQuery(query, Dinosaur.class).getResultList();
		return dinos;
	}

	@Override
	public Dinosaur addNewDino(Dinosaur dino) {
		em.persist(dino);
		return dino;
	}
	
	@Override
	public String removeDino(int dinoId) {
		Dinosaur dino = em.find(Dinosaur.class, dinoId);

		em.remove(dino); // performs the delete on the managed entity
		return dino.toString();
	}

	@Override
	public Dinosaur updateDino(int dinoId, String newName, int newHeight, int newWeight, boolean newFlying, String newDiet, String newSpecialChars, String newSpecies) {
		Dinosaur managedDino;

		managedDino = em.find(Dinosaur.class, dinoId);

		managedDino.setName(newName);
		managedDino.setHeight(newHeight);
		managedDino.setWeight(newWeight);
		managedDino.setFlying(newFlying);
		managedDino.setDiet(newDiet);
		managedDino.setSpecialChars(newSpecialChars);
		managedDino.setSpecies(newSpecies);
		
		return managedDino;
		}
	
	@Override
	public List<Dinosaur> findAllDinos() {
		String query = "SELECT dino FROM Dinosaur dino";
		List<Dinosaur> dinos = em.createQuery(query, Dinosaur.class).getResultList();
		return dinos;
	}	

}

