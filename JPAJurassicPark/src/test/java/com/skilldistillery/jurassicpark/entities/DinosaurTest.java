package com.skilldistillery.jurassicpark.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DinosaurTest {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Dinosaur dinosaur;

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JurassicParkPU");
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	public void setUp() throws Exception {
		em = emf.createEntityManager();
		dinosaur = em.find(Dinosaur.class, 1);
	}

	@AfterEach
	public void tearDown() throws Exception {
		em.close();
		dinosaur = null;
	}

	@Test
	@DisplayName("Test basic JPA functionality")
	void test_Dinosaur_entity_mappings() {
//		assertNotNull(dinosaur);
		assertEquals("Steggy", dinosaur.getName());
		assertEquals(20, dinosaur.getHeight());
		assertEquals(false, dinosaur.isFlying());
		assertEquals(300, dinosaur.getWeight());
		assertEquals("omnivore", dinosaur.getDiet());
		assertNull(dinosaur.getSpecialChars());
	}

}
