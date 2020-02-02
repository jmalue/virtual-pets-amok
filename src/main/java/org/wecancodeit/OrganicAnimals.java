package org.wecancodeit;

public class OrganicAnimals {
	private int animalCount=3;
	private String animalName1;
	private String animalName2;
	private String animalName3;
	private String javaDescription;
	private String gitDescription;
	private String bashDescription;
	private int animalHunger=10;
	private int animalThirst=10;
	private int animalBoredom=10;
	private String PetTick;
	private String waterAllPets;

	public void setanimalCount(int i) {
	}

	public int getanimalCount() {
		return animalCount;
	}

	public String getJavaDescription() {
		return javaDescription;
	}

	public void setJavaDescription(String string) {
		this.javaDescription = string;
		this.javaDescription = "is the color of coffee and smells like it too.";

	}

	public String getGitDescription() {
		return gitDescription;
	}

	public void setGitDescription(String string) {
		this.gitDescription = string;
		this.gitDescription = "looks like a cat, but is in fact a dog.";

	}

	public String getBashDescription() {
		return bashDescription;
	}

	public void setBashDescription(String string) {
		this.bashDescription = string;
		this.bashDescription = "is black and white and full of spunk.";
	}

	public void setAnimalBoredom(int k) {
		this.animalBoredom = (10);
	}

	public void setanimalName1(String string) {
		this.animalName1 = "Java";

	}

	public String getanimalName1() {
		return "";

	}

	public void setanimalName2(String string) {
		this.animalName2 = "Git";
	}

	public String getanimalName2() {
		return "";
	}

	public void setanimalName3(String string) {
		this.animalName3 = "Bash";

	}
	
	public String getanimalName3() {
		return "";
	}

	public void setPetTick(String string) {
		this.animalBoredom = animalBoredom++;
		this.animalThirst = animalThirst++;
		this.animalHunger = animalHunger++;
	}

	public String getPetTick(String string) {
		return "";
	}

	public void setfeedAllPets(String string) {
		this.animalBoredom = animalBoredom--;
		this.animalThirst = animalThirst++;
		this.animalHunger = animalHunger--;

	}

	public String getfeedAllPets(String string) {
		return "";

	}

	public void setwaterAllPets(String result) {
		this.animalBoredom = animalBoredom--;
		this.animalThirst = animalThirst--;

	}

	public String getwaterAllPets(String string) {
		return "";
	
	}
	public int getanimalBoredom() {
		return animalBoredom;
	}

	public void setPetTick(Object result) {

	}

	public Object getPetTick() {
		return "";
	}

	public void setfeedAllPets(Object result) {
	}

	public Object getfeedAllPets() {
		return "";

	}

	public Object getwaterAllPets() {
		return "";

	}

	public void setwaterAllPets(Object result) {

	}
		
	}

	
