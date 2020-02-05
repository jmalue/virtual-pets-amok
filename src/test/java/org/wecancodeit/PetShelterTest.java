package org.wecancodeit;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Test;

public class PetShelterTest {

	@Test
	public void shouldShowShelterName() {
		PetShelter shelterName = new PetShelter();
		shelterName.setshelterName();
		String result = shelterName.getshelterName();
		assertEquals("Arf We Go Meow", result);
	}

	LitterBoxTest litterBox = new LitterBoxTest();
	private RoboticDog RoboDog;
	private RoboticCat RoboCat;
	private OrganicDogs dog;
	private OrganicCats cat;

	@Test
	public void shouldBeAbleToAddPet() {
		OrganicCats cat = new OrganicCats("", null, null);
		OrganicDogs dog = new OrganicDogs("", null, null);
		RoboticDog RoboDog = new RoboticDog("");
		RoboticCat RoboCat = new RoboticCat("");
		PetShelter.addPet(cat);
		PetShelter.addPet(dog);
		PetShelter.addPet(RoboCat);
		PetShelter.addPet(RoboDog);

	}

}
