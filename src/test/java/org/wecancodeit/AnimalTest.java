package org.wecancodeit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AnimalTest {

	@Test
	public void virtualPetShelterName() {
		// arrange
		Animals petShoppe = new Animals();
		// act
		petShoppe.setShelterName("Pet Shoppe");
		String result = petShoppe.getShelterName();
		// assert
		assertEquals("Pet Shoppe", result);
	}

	@Test
	public void petShoppeAnimalCount() {
		// arrange
		Animals animalCount = new Animals();
		// act
		animalCount.setanimalCount(3);
		int result = animalCount.getanimalCount();
		// assert
		assertEquals(3, result);
	}

	@Test
	public void animalShelterPetNames() {
		Animals animalName1 = new Animals();
		// act
		animalName1.setanimalName1("Java");
		String result = animalName1.getanimalName1();
		// assert
		assertEquals("", result);
	}

	@Test
	public void animalShelterPetNames2() {
		Animals animalName2 = new Animals();
		// act
		animalName2.setanimalName2("Git");
		String result = animalName2.getanimalName2();
		// assert
		assertEquals("", result);
	}

	@Test
	public void animalShelterPetNames3() {
		Animals animalName3 = new Animals();
		// act
		animalName3.setanimalName3("Bash");
		String result = animalName3.getanimalName3();
		// assert
		assertEquals("", result);
	}

	@Test
	public void JavaPetDescription() {
		Animals javaDescription = new Animals();
		// act
		javaDescription.setJavaDescription("is the color of coffee and smells like it too");
		Object result = javaDescription.getJavaDescription();
		// assert
		assertEquals("is the color of coffee and smells like it too.", result);

	}

	@Test
	public void GitPetDescription() {
		Animals gitDescription = new Animals();
		// act
		gitDescription.setGitDescription("looks like a cat, but is in fact a dog.");
		Object result = gitDescription.getGitDescription();
		// assert
		assertEquals("looks like a cat, but is in fact a dog.", result);

	}

	@Test
	public void BashPetDescription() {
		Animals bashDescription = new Animals();
		// act
		bashDescription.setBashDescription("is black and white and full of spunk.");
		Object result = bashDescription.getBashDescription();
		// assert
		assertEquals("is black and white and full of spunk.", result);

	}

	@Test
	public void shouldHaveBoredomPet() {
		Animals animalBoredom = new Animals();
		int result = animalBoredom.getanimalBoredom();
		// assert
		assertEquals(10, result);

	}

	@Test
	public void tickAllPets() {
		Animals petTick = new Animals();
		Object result = petTick.getPetTick();
		// act
		petTick.setPetTick(result);
		result = petTick.getPetTick();
		// assert
		assertEquals("", result);
	}

	@Test
	public void feedAllPets() {
		Animals feedAllPets = new Animals();
		Object result = feedAllPets.getfeedAllPets();
		// act
		feedAllPets.setfeedAllPets(result);
		result = feedAllPets.getfeedAllPets();
		// assert
		assertEquals("", result);
	}

	@Test
	public void waterAllPets() {
		Animals waterAllPets = new Animals();
		Object result = waterAllPets.getwaterAllPets();
		// act
		waterAllPets.setwaterAllPets(result);
		result = waterAllPets.getwaterAllPets();
		// assert
		assertEquals("", result);
	}

}