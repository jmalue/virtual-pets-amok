package org.wecancodeit;

public class OrganicCats {

	private static final int DEFAULT_LITTER_LEVEL = 5;
	private int litterLevel = DEFAULT_LITTER_LEVEL;

	public int getlitterLevel() {
		return litterLevel;
	}

	public void removePoop(int amount) {
		litterLevel -= amount;
	}

	public void setallOrganicCats() {
		this.getcat1();
		this.getcat2();
		this.getcat3();
	}

	public String getallOrganicCats() {
		return this.getallOrganicCats();

	}

	public void setcat1(String name) {

	}

	public String getcat1() {
		return "Granger";
	}

	public void setcat2(String name) {

	}

	public String getcat2() {
		return "Potter";
	}

	public void setcat3(String name) {

	}

	public String getcat3() {
		return "Weasley";
	}
}