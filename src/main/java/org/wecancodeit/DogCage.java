package org.wecancodeit;

public class DogCage {

	private static final int DEFAULT_CAGE_CLEANLINESS = 5;
	private static int OrganicDogs = DEFAULT_CAGE_CLEANLINESS;
	private int cageCleanliness;

	public int getcageCleanliness() {
		return cageCleanliness;

	}

	public void getClean() {
		cageCleanliness -= DEFAULT_CAGE_CLEANLINESS;

	}
}
