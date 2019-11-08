package com.skilldistillery.jurassicpark.entities;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DinosaurTest {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Dinosaur dinosaur;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	emf = Persisitence.createEntityMangerFactory("JurassicParkPU")
	}
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	emf.close();
	}

	@Before
	public void setUp() throws Exception {
	em = emf.createEntityMangqer();
	dinosaur = em.find(Dinosaur.class, 1);
	}

	@After
	public void tearDown() throws Exception {
	em.close();
	dinosaur = null;
	}
	
	@Test
	@DisplayName("Test basic JPA functionality")
	void test_Dinosaur_entity_mappings() {
		assertNotNull(dinosaur);
		assertEquals("Denver", dinosaur.getName());
		
		
	}

	

}
