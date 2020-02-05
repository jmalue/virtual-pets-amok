package org.wecancodeit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OrganicAnimalsTest {
	
	OrganicCats underTest = new OrganicCats();
	private int cat2;
	private String cat1;
	private int cat3;
	private OrganicDogs dog2;

	@Test
	public void catNumber1() {
		OrganicCats cat1 = new OrganicCats();

		cat1.setcat1("t\"Name\", t\"description t\", 10, 0, 0, 0, 0");

		String result = cat1.getcat1();

		assertEquals("Granger", result);
	}

	@Test
	public void catNumber2() {
		OrganicCats cat2 = new OrganicCats();

		cat2.setcat2("t\"Name\", t\"description t\", 10, 0, 3, 0, 3");

		String result = cat2.getcat2();

		assertEquals("Potter", result);
	}

	@Test
	public void catNumber3() {
		OrganicCats cat3 = new OrganicCats();

		cat3.setcat3("t\"Name\", t\"description t\", 10, 1, 0, 0, 3");

		String result = cat3.getcat3();

		assertEquals("Weasley", result);
	}

	@Test
	public void dogNumber1() {
		OrganicDogs dog1 = new OrganicDogs();
		dog1.setdog1("t\"Name\", t\"description t\", 9, 1, 0, 0, 3");

		String result = dog1.getdog1();
		assertEquals("Chewy", result);
	}

	@Test
	public void dogNumber2() {
		OrganicDogs dog2 = new OrganicDogs();
		dog2.setdog2("t\"Name\", t\"description t\", 4, 0, 2, 0, 3");

		String result = dog2.getdog2();
		assertEquals("Leia", result);
	}

	@Test
	public void dogNumber3() {
		OrganicDogs dog3 = new OrganicDogs();
		dog3.setdog3("t\"Name\", t\"description t\", 3, 9, 0, 0, 0");

		String result = dog3.getdog3();
		assertEquals("R2", result);
	}
	
	
@Test
	public void shouldHaveBoredomPet() {
		OrganicAnimals animalBoredom = new OrganicAnimals();
		int result = animalBoredom.getanimalBoredom();
		// assert
		assertEquals(10, result);
}
		
		@Test
		public void feedAllPets() {
			OrganicAnimals feedAllPets = new OrganicAnimals();
			Object result = feedAllPets.getfeedAllPets();
			// act
			feedAllPets.setfeedAllPets(result);
			result = feedAllPets.getfeedAllPets();
			// assert
			assertEquals("", result);
		}
	
		@Test
		public void waterAllPets() {
			OrganicAnimals waterAllPets = new OrganicAnimals();
			Object result = waterAllPets.getwaterAllPets();
			// act
			waterAllPets.setwaterAllPets(result);
			result = waterAllPets.getwaterAllPets();
			// assert
			assertEquals("", result);
		}
		
		@Test
		public void shouldShowAnimalHunger() {
			OrganicAnimals animalHunger = new OrganicAnimals();
			OrganicAnimals result = animalHunger = new OrganicAnimals();
			animalHunger.setanimalHunger();
			assertEquals(0, result);
			
		}
//
//	}
//
//	@Test
//	public void tickAllPets() {
//		OrganicAnimals petTick = new OrganicAnimals();
//		String result = petTick.getPetTick();
//		// act
//		petTick.setPetTick(result);
//		result = petTick.getPetTick();
//		// assert
//		assertEquals("", result);
//	}

}

//@Test
//public void petShelterAnimalCount() {
//	// arrange
//	OrganicAnimals animalCount = new OrganicAnimals();
//	// act
//	animalCount.setanimalCount(3);
//	int result = animalCount.getanimalCount();
//	// assert
//	assertEquals(3, result);

//
//@Test
//public void animalShelterPetNames() {
//	OrganicAnimals animalName1 = new OrganicAnimals();
//	// act
//	animalName1.setanimalName1("Java");
//	String result = animalName1.getanimalName1();
//	// assert
//	assertEquals("", result);
//}
//
//@Test
//public void animalShelterPetNames2() {
//	OrganicAnimals animalName2 = new OrganicAnimals();
//	// act
//	animalName2.setanimalName2("Git");
//	String result = animalName2.getanimalName2();
//	// assert
//	assertEquals("", result);
//}
//
//@Test
//public void animalShelterPetNames3() {
//	OrganicAnimals animalName3 = new OrganicAnimals();
//	// act
//	animalName3.setanimalName3("Bash");
//	String result = animalName3.getanimalName3();
//	// assert
//	assertEquals("", result);
//
//@Test
//public void JavaPetDescription() {
//	OrganicAnimals javaDescription = new OrganicAnimals();
//	// act
//	javaDescription.setJavaDescription("is the color of coffee and smells like it too");
//	Object result = javaDescription.getJavaDescription();
//	// assert
//	assertEquals("is the color of coffee and smells like it too.", result);
//
//}
//
//@Test
//public void GitPetDescription() {
//	OrganicAnimals gitDescription = new OrganicAnimals();
//	// act
//	gitDescription.setGitDescription("looks like a cat, but is in fact a dog.");
//	Object result = gitDescription.getGitDescription();
//	// assert
//	assertEquals("looks like a cat, but is in fact a dog.", result);
//
//}
//
//@Test
//public void BashPetDescription() {
//	OrganicAnimals bashDescription = new OrganicAnimals();
//	// act
//	bashDescription.setBashDescription("is black and white and full of spunk.");
//	Object result = bashDescription.getBashDescription();
//	// assert
//	assertEquals("is black and white and full of spunk.", result);