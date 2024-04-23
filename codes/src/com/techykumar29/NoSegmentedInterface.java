package com.techykumar29;

public class NoSegmentedInterface {

}

interface Employee{
	void develop();
	void testApp();
	void deploy();
	void manageTeam();
}

class Developer implements Employee{

	@Override
	public void develop() {
		System.out.println("I develop applications.");
		
	}

	@Override
	public void testApp() {
		System.out.println("Not my job.");
		
	}

	@Override
	public void deploy() {
		System.out.println("Not my job.");
		
	}

	@Override
	public void manageTeam() {
		System.out.println("Not my job.");
		
	}
	
}

class Manager implements Employee{

	@Override
	public void develop() {
		System.out.println("Not my job.");
		
	}

	@Override
	public void testApp() {
		System.out.println("Not my job.");
		
	}

	@Override
	public void deploy() {
		System.out.println("Not my job.");
		
	}

	@Override
	public void manageTeam() {
		System.out.println("Manage Team");
	}
	
}