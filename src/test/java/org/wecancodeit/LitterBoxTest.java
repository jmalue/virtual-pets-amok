package org.wecancodeit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class LitterBoxTest {

	LitterBox underTest = new LitterBox("", "", "");

	@Test
	public void shouldIncreasOrDecreaseLitterLevel() {
		OrganicCats organicCats = new OrganicCats();

		int litterBoxLevelBefore = organicCats.getlitterLevel();
		underTest.getPoop(organicCats);
		int litterBoxLevelAfter = organicCats.getlitterLevel();
		assertThat(litterBoxLevelBefore - litterBoxLevelAfter, is(5));

	}
//	
//
//	@Test
//	public void cleanLitterBox() {
//		LitterBox scoopLitter = new LitterBox();
//		Object result = scoopLitter.getscoopLitter();
//		scoopLitter.setscoopLitter(result);
//		assertEquals("", result);
//	}
//
//	@Test
//	public void tickAllPets() {
//		LitterBox petTick = new LitterBox();
//		String result = petTick.getPetTick(result);
//		// act
//		petTick.setPetTick(result);
//		result = petTick.getPetTick();
//		// assert
//		assertEquals("", result);
//	}
//
//	@Test
//	public void litterBoxLevel() {
//		LitterBox litterLevel = new LitterBox();
//		int result = litterLevel.getlitterLevel();
//		litterLevel.setlitterLevel(5);
//		result = litterLevel.getlitterLevel();
//		assertEquals(5, result);
//	}

//	@Test
//	public void shouldBeAbleToUseLitterBox() {
//		LitterBox.setLitterBox();
//		underTest.tick();
//		underTest.tick();
//
//		int catPoop = underTest.getPoop();
//		assertTrue(catPoop > 0);
//		underTest.useLitterBox();
//
//		int boxPoopLevel = LitterBox.getPoopLevel();
//		assertEquals(catPoop, boxPoopLevel);
//		assertEquals(underTest.getPoop(), 0);

}
