package com.techykumar29;

public class NoLiskov {

	public static void main(String[] args) {
		Animal pigeon = new Pigeon(20);
		Animal bear = new Bear(5);
		
		knowYourAnimal(pigeon);
		knowYourAnimal(bear);
	}
	
	public static void knowYourAnimal(Animal animal) {
		System.out.println("====== About " + animal.getClass().getSimpleName()+ "============");
		animal.fly();
	}
}
interface Animal {
	void fly();
}


class Bear implements Animal {
	
	int speed;
	
	public Bear(int speed) {
		super();
		this.speed = speed;
	}

	@Override
	public void fly() {
		throw new RuntimeException("Bear cannot fly.");
	}

}

class Pigeon implements Animal {

	int flyingSpeed;
	
	public Pigeon(int flyingSpeed) {
		super();
		this.flyingSpeed = flyingSpeed;
	}

	@Override
	public void fly() {
		System.out.printf("Pigeon is flying at %d km/hr.\n",flyingSpeed);
	}

}