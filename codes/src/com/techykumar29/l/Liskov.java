package com.techykumar29.l;

public class Liskov {
	public static void main(String[] args) {
		Animal pigeon = new Pigeon(20);
		Animal bear = new Bear(5);
		
		knowYourAnimal(pigeon);
		knowYourAnimal(bear);
	}
	
	public static void knowYourAnimal(Animal animal) {
		System.out.println("====== About " + animal.getClass().getSimpleName()+ "============");
		animal.move();
	}

}
interface Animal {
	void move();
}


class Bear implements Animal {
	
	int speed;
	
	public Bear(int speed) {
		super();
		this.speed = speed;
	}

	@Override
	public void move() {
		System.out.printf("Bear runs at speed of %d km/hr.\n",speed );
	}

}

class Pigeon implements Animal {

	int flyingSpeed;
	
	public Pigeon(int flyingSpeed) {
		super();
		this.flyingSpeed = flyingSpeed;
	}

	@Override
	public void move() {
		System.out.printf("Pigeon is flying at %d km/hr.\n",flyingSpeed);
	}

}