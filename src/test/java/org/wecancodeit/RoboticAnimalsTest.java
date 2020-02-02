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
		// act
		robotCat.setrobotCat(result);
		result = (String) robotCat.getrobotCat();
		// assert
		assertEquals("RoboCat", result);

	}

	@Test
	public void shouldBeAbleToOilRobotPets() {
		RoboticAnimals oilRobotPets = new RoboticAnimals();
		Object result = oilRobotPets.getoilRobotPets();
		// act
		oilRobotPets.setoilRobotPets(result);
		// assert
		assertEquals("", result);
	}

	@Test
	public void shouldChargeLowBattery() {
		RoboticAnimals chargeBattery = new RoboticAnimals();
		Object result = chargeBattery.getchargeBattery();
		// act
		chargeBattery.setchargeBattery(result);
		// assert
		assertEquals("", result);
	}

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
