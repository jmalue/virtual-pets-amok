package org.wecancodeit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RoboticAnimalsTest {

	@Test
	public void shouldBeRobotDog() {
		RoboticAnimals robotDog = new RoboticAnimals();
		String result = "";
		// act
		robotDog.setrobotDog(result);
		result = (String) robotDog.getrobotDog();
		// assert
		assertEquals("RoboDog", result);

	}
	@Test
	public void shouldBeRobotCat() {
		RoboticAnimals robotCat = new RoboticAnimals();
		String result = "";
		//act
		robotCat.setrobotCat(result);
		result = (String) robotCat.getrobotCat();
		//assert
		assertEquals("RoboCat", result);
		
		
	}
}
