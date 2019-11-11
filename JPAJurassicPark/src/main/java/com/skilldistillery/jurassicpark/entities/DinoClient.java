package com.skilldistillery.jurassicpark.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DinoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JurassicParkPU");
		EntityManager em = emf.createEntityManager();
		
		Dinosaur dino = em.find(Dinosaur.class, 1);
		System.out.println(dino);
		System.out.println("***************************");
		em.close();
		emf.close();
	}

}
