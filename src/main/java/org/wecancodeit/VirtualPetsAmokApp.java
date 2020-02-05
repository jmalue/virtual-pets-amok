package org.wecancodeit;

import java.util.Scanner;

public class VirtualPetsAmokApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		{
			DogCage DogCage = new DogCage();
			LitterBox LitterBox = new LitterBox();
			OrganicAnimals OrganicAnimals = new OrganicAnimals();
			OrganicCats OrganicCats = new OrganicCats();
			OrganicDogs OrganicDogs = new OrganicDogs();
			PetShelter PetShelter = new PetShelter();
			RoboticAnimals RoboticAnimals = new RoboticAnimals();
			RoboticCat RoboticCat = new RoboticCat();
			RoboticDog RoboticDog = new RoboticDog();

			DogCage.getcageCleanliness();
			LitterBox.getPetTick("");
			LitterBox.getPoop(OrganicCats);
			OrganicAnimals.getcat1();
			OrganicAnimals.getcat2();
			OrganicAnimals.getcat3();
			OrganicAnimals.getallOrganicCats();
			OrganicAnimals.getfeedAllPets();
			OrganicAnimals.getwaterAllPets();
			OrganicAnimals.getPoop();
			OrganicAnimals.getPetTick();
			OrganicAnimals.getanimalHunger();
			OrganicAnimals.getanimalThirst();
			OrganicAnimals.getanimalBoredom();
			OrganicCats.getcat1();
			OrganicCats.getcat2();
			OrganicCats.getcat3();
			OrganicCats.getlitterLevel();
			OrganicCats.removePoop(0);
			OrganicDogs.getdog1();
			OrganicDogs.getdog2();
			OrganicDogs.getdog3();
			PetShelter.addPet(OrganicCats);
			PetShelter.addPet(OrganicDogs);
			PetShelter.addPet(RoboticCat);
			PetShelter.addPet(RoboticDog);
			PetShelter.getshelterName();
			RoboticAnimals.getrobotCat();
			RoboticAnimals.getrobotDog();
			RoboticAnimals.getchargeBattery();
			RoboticAnimals.getoilRobotPets();
			RoboticAnimals.getshutDown();
			RoboticCat.getClass();
			RoboticDog.getClass();

			while (true) {
				System.out.println("Welcome to " + PetShelter.getshelterName());
				System.out.println("1. View Current Pets " + "\n2. Attend to Robo or Organic Pets" + "\n3. Adopt a Pet"
						+ "\n4. Admit a Pet" + "\n5. Help");
				String optionEntered = input.nextLine();
				{
					switch (optionEntered) {

					case "1":
						System.out.println(OrganicCats.getcat1() + " Hunger = " + OrganicAnimals.getanimalHunger()
								+ " Thirst = " + OrganicAnimals.getanimalThirst() + " Boredom = "
								+ OrganicAnimals.getanimalBoredom());
						System.out.println(OrganicCats.getcat2() + " Hunger = " + OrganicAnimals.getanimalHunger()
								+ " hirst = " + OrganicAnimals.getanimalThirst() + " Boredom = "
								+ OrganicAnimals.getanimalBoredom());
						System.out.println(OrganicCats.getcat3() + " Hunger = " + OrganicAnimals.getanimalHunger()
								+ " Thirst = " + OrganicAnimals.getanimalThirst() + " Boredom = "
								+ OrganicAnimals.getanimalBoredom());
						System.out.println(OrganicDogs.getdog1() + " Hunger = " + OrganicAnimals.getanimalHunger()
								+ " Thirst = " + OrganicAnimals.getanimalThirst() + " Boredom = "
								+ OrganicAnimals.getanimalBoredom());
						System.out.println(OrganicDogs.getdog2() + " Hunger = " + OrganicAnimals.getanimalHunger()
								+ " Thirst = " + OrganicAnimals.getanimalThirst() + " Boredom = "
								+ OrganicAnimals.getanimalBoredom());
						System.out.println(OrganicDogs.getdog3() + " Hunger = " + OrganicAnimals.getanimalHunger()
								+ " Thirst = " + OrganicAnimals.getanimalThirst() + " Boredom = "
								+ OrganicAnimals.getanimalBoredom());
						System.out.println(RoboticAnimals.getrobotCat() + " Battery = "
								+ RoboticAnimals.getchargeBattery() + " Oil = " + RoboticAnimals.getoilRobotPets());
						System.out.println(RoboticAnimals.getrobotDog() + " Battery = "
								+ RoboticAnimals.getchargeBattery() + " Oil = " + RoboticAnimals.getoilRobotPets());
						break;
					case "2":
						System.out.println("What would you like to do?");
						System.out
								.println("1. Oil All Robots" + "\n2. Clean All Cages" + "\n3. Empty All Litter Boxes");
						String optionEntry = input.nextLine();
						if (optionEntry.contentEquals("1")) {
							System.out.println("You have oiled all the Robo Pets");
						} else if (optionEntry.contentEquals("2")) {
							System.out.println("You have cleaned all the cages");
							System.out.println("Dog cage cleanliness level is now " + DogCage.getcageCleanliness());
						} else {
							System.out.println("You have emptied all the litter boxes");
							System.out.println("Litter box level is now " + OrganicCats.getlitterLevel());
						}
						break;
					case "3":
						System.out.println("You have chosen to adopt a pet.");
						System.out.println("Which pet would you like to adopt? " + "\n1." + OrganicCats.getcat1()
								+ "\n2." + OrganicCats.getcat2() + "\n3." + OrganicCats.getcat3() + "\n4."
								+ OrganicDogs.getdog1() + "\n5." + OrganicDogs.getdog2() + "\n6."
								+ OrganicDogs.getdog3() + "\n7." + RoboticAnimals.getrobotCat() + "\n8."
								+ RoboticAnimals.getrobotDog());
						String entryOption = input.nextLine();
						if (entryOption.contentEquals("1")) {
							System.out.println("You have chosen to adopt " + OrganicCats.getcat1());
						} else if (entryOption.contentEquals("2")) {
							System.out.println("You have chosen adopt " + OrganicCats.getcat2());
						} else if (entryOption.contentEquals("3")) {
							System.out.println("You have chosen adopt " + OrganicCats.getcat3());
						} else if (entryOption.contentEquals("4")) {
							System.out.println("You have chosen adopt " + OrganicDogs.getdog1());
						} else if (entryOption.contentEquals("5")) {
							System.out.println("You have chosen adopt " + OrganicDogs.getdog2());
						} else if (entryOption.contentEquals("6")) {
							System.out.println("You have chosen adopt " + OrganicDogs.getdog3());
						} else if (entryOption.contentEquals("7")) {
							System.out.println("You have chosen adopt " + RoboticAnimals.getrobotCat());
						} else {
							System.out.println("You have chosen adopt " + RoboticAnimals.getrobotDog());
						}
						break;
					case "4":
						System.out.println("What type of Pet would you like to admit?");
						System.out.println("1. RoboDog" + "\n2. RoboCat" + "\n3. Cat" + "\n4. Dog");
						String enterInput = input.nextLine();
						if (enterInput.contentEquals("1")) {
							System.out.println("Thank you for admitting a RoboDog");
						} else if (enterInput.contentEquals("2")) {
							System.out.println("Thank you for admitting a RoboCat");
						} else if (enterInput.contentEquals("3")) {
							System.out.println("Thank you for admitting a Cat");
						} else {
							System.out.println("Thank you for admitting a Dog");
						}
						break;
					default:
						System.out.println("... I need somebody, not just anybody. Have a great day!");
						break;
					}
				}

				LitterBox.getPetTick("");
				OrganicAnimals.getPetTick();
			}
		}
	}
}

//			PetShelter getSheltername = new PetShelter();		
//			OrganicCats cat1 = new OrganicCats();
//			OrganicCats cat2 = new OrganicCats();
//			OrganicCats cat3 = new OrganicCats();
//			OrganicDogs dog1 = new OrganicDogs();
//			OrganicDogs dog2= new OrganicDogs();
//			OrganicDogs dog3 = new OrganicDogs();
//			RoboticCat RoboCat = new RoboticCat();
//			RoboticDog RoboDog = new RoboticDog();
//			OrganicAnimals animalBoredom = new OrganicAnimals();
//			OrganicAnimals waterAllPets = new OrganicAnimals();
//			OrganicAnimals feedAllPets = new OrganicAnimals();
//			OrganicAnimals PetTick = new OrganicAnimals();
//			RoboticAnimals oilRobotPets = new RoboticAnimals();
//			RoboticAnimals chargeLowBattery = new RoboticAnimals();
//			RoboticAnimals shutDown = new RoboticAnimals();
//			PetShelter.addPet()
//			PetShelter.
