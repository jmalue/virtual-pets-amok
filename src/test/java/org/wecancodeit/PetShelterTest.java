package org.wecancodeit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PetShelterTest {

	@Test
	public void shouldShowShelterName() {
		PetShelter shelterName = new PetShelter();
		shelterName.setshelterName();
		String result = shelterName.getshelterName();
		assertEquals("Arf We Go Meow", result);
	}

}