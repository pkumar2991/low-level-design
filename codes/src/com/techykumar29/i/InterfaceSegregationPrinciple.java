package com.techykumar29.i;

public class InterfaceSegregationPrinciple {

}

interface AppDeveloper{
	void develop();
}
interface AppTester{
	void testApp();
}
interface TeamManager{
	void manageTeam();
}

class Developer implements AppDeveloper{

	@Override
	public void develop() {
		System.out.println("I develop applications.");
		
	}
}

class Manager implements TeamManager{

	public void manageTeam() {
		System.out.println("Manage Team");
	}
	
}
