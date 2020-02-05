package org.wecancodeit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RoboticAnimalsTest implements RobotAnimals {

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
		// act
		robotCat.setrobotCat(result);
		result = (String) robotCat.getrobotCat();
		// assert
		assertEquals("RoboCat", result);

	}

	@Override
	@Test
	public void shouldBeAbleToOilRobotPets() {
		RoboticAnimals oilRobotPets = new RoboticAnimals();
		int result = oilRobotPets.getoilRobotPets();
		// assert
		assertEquals(10, result);
	}

	@Override
	@Test
	public void shouldChargeLowBattery() {
		RoboticAnimals chargeBattery = new RoboticAnimals();
		int result = chargeBattery.getchargeBattery();
		// assert
		assertEquals(10, result);
	}

	@Override
	@Test
	public void shouldShutDown() {
		RoboticAnimals shutDown = new RoboticAnimals();
		Object result = shutDown.getshutDown();
		// act
		shutDown.setshutDown(result);
		// assert
		assertEquals("", result);
	}

}
