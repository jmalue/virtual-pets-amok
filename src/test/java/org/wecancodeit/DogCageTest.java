package org.wecancodeit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DogCageTest {

	
	DogCage underTest = new DogCage();

	@Test
	public void shouldIncreasOrDecreaseCageCleanliness() {
		OrganicDogs organicDogs = new OrganicDogs();

		int cageCleanlinessBefore = OrganicDogs.getcageCleanliness();
		underTest.getClean();
		int cageCleanlinessAfter = OrganicDogs.getcageCleanliness();
		assertThat(cageCleanlinessBefore - cageCleanlinessAfter, is(0));
	}
}
